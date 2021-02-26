package com.newland.mrs.impl.config.rule;

import com.newland.mrs.impl.bootstrap.Bootstrap;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * KieSessionHelper
 * 获取KieSession
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-28 10:28
 **/
@Component
public class KieSessionHelper {

    private static final Logger logger = LoggerFactory.getLogger(KieSessionHelper.class);

    private final Bootstrap bootstrap;

    public KieSessionHelper(Bootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    public KieSession getKieSession(String configNo) {
         KieSession kieSession = bootstrap.getKieContainerMap(configNo).getKieBase().newKieSession();
         kieSession.setGlobal("logger", logger);
         return kieSession;
    }
}
