package com.newland.mrs.impl.controller;

import com.alibaba.fastjson.JSONObject;
import com.newland.mrs.api.entity.ApplyRouteRequest;
import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;
import com.newland.mrs.api.enums.MrsApiEnum;
import com.newland.mrs.impl.annotation.RequestVerify;
import com.newland.mrs.impl.config.rule.KieSessionHelper;
import com.newland.mrs.impl.config.rule.listener.HitRuleListener;
import com.newland.mrs.impl.entity.Fact;
import com.newland.mrs.impl.handler.MrsApiService;
import com.newland.mrs.impl.service.MrsFunderConfigService;
import com.newland.mrs.persist.model.MrsApplyRoute;
import com.newland.mrs.persist.model.MrsFunderConfig;
import org.kie.api.definition.rule.Rule;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MrsServiceController
 *
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-28 11:22
 **/
@RestController
public class MrsServiceController {

    private static final Logger logger = LoggerFactory.getLogger(MrsServiceController.class);

    private final KieSessionHelper kieSessionHelper;

    private final MrsFunderConfigService mrsFunderConfigService;

    private final MrsApiService mrsApiService;

    public MrsServiceController(KieSessionHelper kieSessionHelper, MrsFunderConfigService mrsFunderConfigService, MrsApiService mrsApiService) {
        this.kieSessionHelper = kieSessionHelper;
        this.mrsFunderConfigService = mrsFunderConfigService;
        this.mrsApiService = mrsApiService;
    }

    @RequestMapping(value = "/index/{age}")
    public String index(@PathVariable("age") String age) throws IllegalAccessException {
//        MrsApplyRoute mrsApplyRoute = new MrsApplyRoute();
//        mrsApplyRoute.setApplyAge(Integer.valueOf(age));
//        mrsApplyRoute.setLimitStartDate(new Date());
//        mrsApplyRoute.setApplyCrowd("B");
//        List<MrsFunderConfig> mrsFunderConfigs = mrsFunderConfigService.selectFunderConfigEnable("1355000010353283072");
//        for (MrsFunderConfig config : mrsFunderConfigs) {
//            KieSession kieSession = kieSessionHelper.getKieSession(config.getId().toString());
//            HitRuleListener hitRuleListener = new HitRuleListener();
//            kieSession.addEventListener(hitRuleListener);
//            kieSession.insert(Fact.makeFactMap(mrsApplyRoute));
//            kieSession.fireAllRules();
//            List<Rule> hitRules = hitRuleListener.getHitRules();
//            hitRules.forEach(e -> {
//                System.out.println(e.getName());
//            });
//        }
        return "1111";
    }

    private final static Map<String, Class<?>> REQUEST_OBJECT = new HashMap<>();

    static {
        REQUEST_OBJECT.put(MrsApiEnum.applyRoute.getCode(), ApplyRouteRequest.class);
    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    @RequestVerify
    public MrsResponseInfo mrsApiInvoke(@RequestBody MrsRequestInfo mrsRequestInfo) {
        String apiName = mrsRequestInfo.getApiName();
        String dataJson = JSONObject.toJSONString(mrsRequestInfo.getRequestData());
        Class<?> tc = REQUEST_OBJECT.get(apiName);
        if (tc == null) {
            return MrsResponseInfo.newFailure("1003", "不支持的接口");
        }
        mrsRequestInfo.setRequestData(JSONObject.parseObject(dataJson, tc));
        return mrsApiService.invoke(mrsRequestInfo);
    }
}
