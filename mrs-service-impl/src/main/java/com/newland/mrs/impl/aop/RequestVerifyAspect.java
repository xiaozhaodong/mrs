package com.newland.mrs.impl.aop;

import com.alibaba.fastjson.JSONObject;
import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;
import com.newland.mrs.api.valid.annotation.ListObject;
import com.newland.mrs.impl.config.MrsProperties;
import com.newland.mrs.impl.util.BeanValidator;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * RequestVerifyAspect
 * 接口请求验证Aop
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-29 15:08
 **/
@Aspect
@Component
public class RequestVerifyAspect {

    private static final Logger logger = LoggerFactory.getLogger(RequestVerifyAspect.class);

    /**
     * 日志跟踪id名。
     */
    private static final String LOG_TRACE_ID = "traceId";

    private final MrsProperties mrsProperties;

    public RequestVerifyAspect(MrsProperties mrsProperties) {
        this.mrsProperties = mrsProperties;
    }

    @Pointcut("execution(public * *(..)) && @annotation(com.newland.mrs.impl.annotation.RequestVerify)")
    public void pointcut() {

    }

    @Around(value = "pointcut()")
    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        MDC.put(LOG_TRACE_ID,  "traceId:" + UUID.randomUUID().toString().replaceAll("-", "") + ",");
        Object[] args = pjp.getArgs();
        MrsRequestInfo requestInfo = ((MrsRequestInfo) args[0]);
        logger.info("调用方:{},请求参数:{}", requestInfo.getApiInvokerCode(), JSONObject.toJSONString(requestInfo));
        Object returnObject = checkProcess(pjp, requestInfo);
        logger.info("调用方:{},返回参数:{}", requestInfo.getApiInvokerCode(), JSONObject.toJSONString(returnObject));
        return returnObject;
    }

    private Object checkProcess(ProceedingJoinPoint pjp, MrsRequestInfo requestInfo) throws Throwable {
        Map<String,String> outVailInfo = BeanValidator.validateObject(requestInfo.getRequestData());
        // 校验外层对象值
        if (outVailInfo != null && outVailInfo.entrySet().size() > 0) {
            return getFailureObject(outVailInfo);
        }
        Map<String,String> vailInfo = BeanValidator.validateObject(requestInfo.getRequestData());
        if (vailInfo != null && vailInfo.entrySet().size() > 0) {
            return getFailureObject(vailInfo);
        } else {
            Field[] fields = requestInfo.getRequestData().getClass().getDeclaredFields();
            for (Field field : fields) {
                ListObject listObject = field.getAnnotation(ListObject.class);
                if (listObject != null) {
                    field.setAccessible(true);
                    Object value = field.get(requestInfo.getRequestData());
                    List<?> objectList = ((List<?>) value);
                    if (objectList == null) {
                        return MrsResponseInfo.newFailure("1002", "请求参数不合法:" + listObject.message());
                    }
                    if (listObject.minSize() > 0 && objectList.size() < listObject.minSize()) {
                        return MrsResponseInfo.newFailure("1002", "请求参数不合法:" + listObject.message());
                    }
                    if (listObject.maxSize() > 0 && objectList.size() > listObject.minSize()) {
                        return MrsResponseInfo.newFailure("1002", "请求参数不合法:" + listObject.message());
                    }
                    for (Object object : objectList) {
                        Map<String,String> info = BeanValidator.validateObject(object);
                        if (info != null && info.entrySet().size() > 0) {
                            return getFailureObject(info);
                        }
                    }
                }
            }
            // 检查md5 签名是否正确
//            String md5Token = mrsProperties.getInvokerMd5().get(requestInfo.getApiInvokerCode());
//            JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(requestInfo.getRequestData()));
//            jsonObject.put("token", md5Token);
//            String unSign = genSignData(jsonObject);
//            logger.info("未验证支付串:{}", unSign);
//            String md5Str = DigestUtils.md5DigestAsHex(unSign.getBytes(StandardCharsets.UTF_8));
//            if (!md5Str.equals(requestInfo.getSignature())) {
//                return MrsResponseInfo.newFailure("1001", "签名验证错误");
//            }
            return pjp.proceed();
        }
    }

    private Object getFailureObject(Map<String, String> info) {
        StringBuilder message = new StringBuilder("请求参数不合法，校验失败");
        for (Map.Entry<String, String> entry : info.entrySet()) {
            logger.info("参数校验结果:{}-->{}", entry.getKey(), entry.getValue());
            message.append("{").append(entry.getValue()).append("}");
        }
        return MrsResponseInfo.newFailure("1002", message.toString());
    }

    /**
     * 生成待签名串
     * @param jsonObject 需要验证的参数
     * @return 待验证字符串
     */
    protected String genSignData(JSONObject jsonObject) {
        StringBuilder content = new StringBuilder();
        // 按照key做首字母升序排列
        List<String> keys = new ArrayList<>(jsonObject.keySet());
        keys.sort(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value =  jsonObject.getString(key);
            // 空串不参与签名
            if ((StringUtils.isBlank(value))) {
                continue;
            }
            content.append(i == 0 ? "" : "&").append(key).append("=").append(value);
        }
        String signSrc = content.toString();
        if (signSrc.startsWith("&")) {
            signSrc = signSrc.replaceFirst("&", "");
        }
        return signSrc;
    }
}
