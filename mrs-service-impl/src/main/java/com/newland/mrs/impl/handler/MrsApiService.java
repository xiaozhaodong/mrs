package com.newland.mrs.impl.handler;

import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;
import com.newland.mrs.api.enums.MrsApiEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * MrsApiService
 * mrs Api 服务
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 17:24
 **/
@Component
public class MrsApiService {

    private final Map<String, AbstractMrsHandler> mrsHandlerMap;

    /**
     * apiName对应执行的beanName
     */
    private final static Map<String, String> API_BEAN_NAME = new HashMap<>();


    public MrsApiService(Map<String, AbstractMrsHandler> mrsHandlerMap) {
        this.mrsHandlerMap = mrsHandlerMap;
    }

    static {
        API_BEAN_NAME.put(MrsApiEnum.applyRoute.getCode(), "applyRouteHandler");
    }

    public MrsResponseInfo invoke(MrsRequestInfo mrsRequestInfo) {
        try {
            String beanName = API_BEAN_NAME.get(mrsRequestInfo.getApiName());
            return mrsHandlerMap.get(beanName).handle(mrsRequestInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return MrsResponseInfo.newFailure("E000", "处理异常");
        }
    }
}
