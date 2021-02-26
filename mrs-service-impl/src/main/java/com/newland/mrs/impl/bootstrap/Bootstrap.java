package com.newland.mrs.impl.bootstrap;

import com.newland.mrs.impl.config.MrsProperties;
import com.newland.mrs.impl.service.*;
import com.newland.mrs.persist.model.*;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Bootstrap
 * 启动完引导类(加载规则到规则容器)
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-27 17:51
 **/
@Component
public class Bootstrap implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    private final ConcurrentMap<String, KieContainer> kieContainerMap = new ConcurrentHashMap<>();

    private final MrsRuleConfigService mrsRuleConfigService;

    private final MrsFunderConfigService mrsFunderConfigService;

    private final MrsDivisionConfigService mrsDivisionConfigService;

    private final MrsMktFunderConfigService mrsMktFunderConfigService;

    private final MrsRuleDetailService mrsRuleDetailService;

    private final MrsProperties mrsProperties;

    /**
     * 规则模版
     */
    private static final String RULE_TEMPLATE = "package rules.configNo_{0};\n" +
            "import com.newland.mrs.impl.entity.Fact;\n" +
            "global org.slf4j.Logger logger;\n" +
            "rule \"{1}\"\n" +
            "    salience {2}\n" +
            "    when\n" +
            "        {3}\n" +
            "    then\n" +
            "        logger.info(\"配置ID:{4},规则编号:{5},规则:{6},命中\");\n" +
            "end";

    public Bootstrap(MrsFunderConfigService mrsFunderConfigService, MrsRuleConfigService mrsRuleConfigService, MrsDivisionConfigService mrsDivisionConfigService, MrsMktFunderConfigService mrsMktFunderConfigService, MrsRuleDetailService mrsRuleDetailService, MrsProperties mrsProperties) {
        this.mrsFunderConfigService = mrsFunderConfigService;
        this.mrsRuleConfigService = mrsRuleConfigService;
        this.mrsDivisionConfigService = mrsDivisionConfigService;
        this.mrsMktFunderConfigService = mrsMktFunderConfigService;
        this.mrsRuleDetailService = mrsRuleDetailService;
        this.mrsProperties = mrsProperties;
    }

    @Override
    public void run(ApplicationArguments args) {
        logger.info("spring容器启动完成，开始加载规则");
        List<String> ruleNos = mrsProperties.getRuleNos();
        if (ruleNos.size() == 0) {
            throw new RuntimeException("规则未配置");
        }
        List<MrsRuleConfig> ruleConfigs = mrsRuleConfigService.selectMrsRuleByRuleNos(ruleNos);
        if (ruleConfigs == null || ruleConfigs.size() == 0) {
            throw new RuntimeException("数据库中无对应规则配置");
        }
        ruleConfigs.forEach(rule -> loadRuleDetail(rule.getRuleNo()));
    }

    private void loadRuleDetail(String ruleNo) {
        loadFunderElement(ruleNo);
        loadDivisionMatch(ruleNo);
    }

    private void loadFunderElement(String ruleNo) {
        List<MrsFunderConfig> mrsFunderConfigs = mrsFunderConfigService.selectFunderConfigEnable(ruleNo);
        if (mrsFunderConfigs != null && mrsFunderConfigs.size() > 0) {
            logger.info("开始装载资金路由规则");
            mrsFunderConfigs.forEach(config -> {
                Long configId = config.getId();
                List<MrsRuleDetail> mrsRuleDetails = mrsRuleDetailService.selectRuleDetailByConfigId(configId, "funder_element");
                if (mrsRuleDetails != null && mrsRuleDetails.size() > 0) {
                    logger.info("资金方配置编号:{},资金方编号:{},路由规则装载", configId, config.getFunderCode());
                    String configNo = "funder_element_" + configId;
                    installKeiContainer(configNo, mrsRuleDetails);
                } else {
                    logger.info("资金方配置编号:{},资金方编号:{},无路由规则", configId, config.getFunderCode());
                }
            });
            logger.info("装载资金路由规则结素");
        } else {
            logger.info("未配资金方");
        }
    }

    private void loadDivisionMatch(String ruleNo) {
        List<MrsDivisionConfig> mrsDivisionConfigs = mrsDivisionConfigService.selectDivisionConfigByRuleNo(ruleNo);
        if (mrsDivisionConfigs != null && mrsDivisionConfigs.size() > 0) {
            logger.info("开始装载市场推送规则");
            mrsDivisionConfigs.forEach(config -> {
                List<MrsMktFunderConfig> mrsMktFunderConfigs = mrsMktFunderConfigService.selectMktFunderByDivisionId(config.getId());
                if (mrsMktFunderConfigs != null && mrsMktFunderConfigs.size() > 0) {
                    mrsMktFunderConfigs.forEach(mrsMktFunderConfig -> {
                        logger.info("事业部编号:{},团队编号:{},资金方编号:{},推送匹配规则装载", config.getDivisionCode(), config.getTeamCode(), mrsMktFunderConfig.getFunderCode());
                        List<MrsRuleDetail> mrsRuleDetails = mrsRuleDetailService.selectRuleDetailByConfigId(mrsMktFunderConfig.getId(), "division_match");
                        if (mrsRuleDetails != null && mrsRuleDetails.size() > 0) {
                            String configNo = "division_match_" + config.getId() + "_" + mrsMktFunderConfig.getId();
                            installKeiContainer(configNo, mrsRuleDetails);
                        } else {
                            logger.info("事业部编号:{},团队编号:{},资金方编号:{},无可用推送规则配置", config.getDivisionCode(), config.getTeamCode(), mrsMktFunderConfig.getFunderCode());
                        }
                    });
                } else {
                    logger.info("事业部编号:{},团队编号:{},资方推送匹配无可用配置",config.getDivisionCode(), config.getTeamCode());
                }
            });
            logger.info("装载市场推送规则结束");
        } else {
            logger.info("无可置事业部团队配置");
        }
    }

    private void installKeiContainer(String configNo, List<MrsRuleDetail> mrsRuleDetails) {
        KieServices kieServices = KieServices.get();
        KieModuleModel kieModuleModel = kieServices.newKieModuleModel();
        KieBaseModel kieBaseModel = kieModuleModel.newKieBaseModel("kieBase_" + configNo);
        kieBaseModel.setDefault(true);
        kieBaseModel.addPackage(MessageFormat.format("rules.configNo_{0}", configNo));
        kieBaseModel.newKieSessionModel("kieSession_" + configNo);
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        for (MrsRuleDetail rule : mrsRuleDetails) {
            String fullPath = MessageFormat.format("src/main/resources/rules/configNo_{0}/{1}.drl", configNo, String.valueOf(rule.getId()));
            String ruleContext = MessageFormat.format(RULE_TEMPLATE, configNo, String.valueOf(rule.getId()),
                    String.valueOf(rule.getPriority()), rule.getRuleContext(),
                    configNo, rule.getRuleCode(), rule.getRuleName(), "\"" + rule.getId() + "\"");
            logger.info(ruleContext);
            kieFileSystem.write(fullPath, ruleContext);
        }
        kieFileSystem.writeKModuleXML(kieModuleModel.toXML());
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem).buildAll();
        Results results = kieBuilder.getResults();
        if (results.hasMessages(Message.Level.ERROR)) {
            logger.info("配置编号:{},规则装在到引擎失败", configNo);
            throw new RuntimeException("规则装在到引擎失败");
        }
        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
        kieContainerMap.put("kieContainer_" + configNo, kieContainer);
    }

    public KieContainer getKieContainerMap(String configNo) {
        return kieContainerMap.get("kieContainer_" + configNo);
    }
}
