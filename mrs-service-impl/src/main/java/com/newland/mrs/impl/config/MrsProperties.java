package com.newland.mrs.impl.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * MrsProperties
 *
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 16:15
 **/
@Configuration
@ConfigurationProperties(prefix = "mrs.system")
public class MrsProperties {

    /**
     * 启用的场景规则编号
     */
    private List<String> ruleNos;

    private Map<String, String> invokerMd5;

    public List<String> getRuleNos() {
        return ruleNos;
    }

    public void setRuleNos(List<String> ruleNos) {
        this.ruleNos = ruleNos;
    }

    public Map<String, String> getInvokerMd5() {
        return invokerMd5;
    }

    public void setInvokerMd5(Map<String, String> invokerMd5) {
        this.invokerMd5 = invokerMd5;
    }
}
