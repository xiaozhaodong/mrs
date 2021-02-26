package com.newland.mrs.impl.mq.consumer.listener;

import com.alibaba.fastjson.annotation.JSONField;
import com.newland.mrs.api.enums.YorNEnum;
import com.newland.mrs.impl.enums.ApplyStatusEnum;
import com.newland.mrs.impl.enums.ResultStatusEnum;
import com.newland.mrs.impl.mq.consumer.AbstractMrsMessageListener;
import com.newland.mrs.impl.mq.consumer.BusinessResult;
import com.newland.mrs.impl.service.MrsApplyRouteService;
import com.newland.mrs.impl.service.MrsFunderMatchService;
import com.newland.mrs.persist.model.MrsApplyRoute;
import com.newland.mrs.persist.model.MrsFunderMatch;
import org.apache.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * RiskInvokeMessageListener
 * 风控平台调用MQ消息监听
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-03 18:00
 **/
@Component("riskInvokeMessageListener'")
public class RiskInvokeMessageListener extends AbstractMrsMessageListener {

    public static final String CONSUME_GROUP = "risk_invoke_consumer";

    private static final Logger logger = LoggerFactory.getLogger(RiskInvokeMessageListener.class);

    private final MrsApplyRouteService mrsApplyRouteService;

    private final MrsFunderMatchService mrsFunderMatchService;

    public RiskInvokeMessageListener(MrsApplyRouteService mrsApplyRouteService, MrsFunderMatchService mrsFunderMatchService) {
        this.mrsApplyRouteService = mrsApplyRouteService;
        this.mrsFunderMatchService = mrsFunderMatchService;
    }

    @Override
    public String getConsumeGroupName() {
        return CONSUME_GROUP;
    }

    @Override
    public boolean allowRepeat() {
        return true;
    }

    @Override
    public BusinessResult businessProcess(MessageExt ext) {
        String message = new String(ext.getBody());
        logger.info("路由申请编号:{},开始调用风控平台处理:{}", ext.getKeys(), message);
        MrsApplyRoute mrsApplyRoute = mrsApplyRouteService.selectApplyRouteByRouteNo(ext.getKeys());
        if (mrsApplyRoute == null) {
            return BusinessResult.failure("路由申请信息不存在");
        }
        if (!ApplyStatusEnum.FUNDER_MATCH_EN.getCode().equals(mrsApplyRoute.getApplyStatus())) {
            return BusinessResult.failure("路由申请信息状态非法");
        }
        List<MrsFunderMatch> mrsFunderMatches = mrsFunderMatchService.selectFunderMatchByRoute(ext.getKeys());
        if (mrsFunderMatches == null || mrsFunderMatches.size() == 0) {
            return BusinessResult.failure("资金方配置信息不存在");
        }
        List<MrsFunderMatch> mrsFunderMatchEd = mrsFunderMatches.stream().filter(t ->
                ResultStatusEnum.MATCH_ED.getCode().equals(t.getMatchStatus()) &&
                YorNEnum.Y.getCode().equals(t.getHitSign())).collect(Collectors.toList());
        if (mrsFunderMatchEd.size() <= 0) {
            return BusinessResult.failure("满足匹配的资金方不存在");
        }
        StringBuilder fundersBuilder = new StringBuilder();
        for (MrsFunderMatch funderMatch : mrsFunderMatchEd) {
            fundersBuilder.append(funderMatch.getFunderCode()).append(",");
        }
        String funders = fundersBuilder.substring(0, fundersBuilder.lastIndexOf(","));
        RiskRequest riskRequest = new RiskRequest();
        riskRequest.setCustomName(mrsApplyRoute.getCustomName());
        riskRequest.setCustomPhone(mrsApplyRoute.getCustomPhone());
        riskRequest.setIdNo(mrsApplyRoute.getCustomIdNo());
        riskRequest.setAppNo(mrsApplyRoute.getApplyNo());
        riskRequest.setUscCode(mrsApplyRoute.getUscCode());
        riskRequest.setCorpName(mrsApplyRoute.getCompanyName());
        riskRequest.setLongOrgList(funders);

        return null;
    }

    private static class RiskRequest {

        /**
         * 客户名称
         * Y
         */
        @JSONField(name = "CUST_NAME")
        private String customName;

        /**
         * 客户手机号
         * Y
         */
        @JSONField(name = "CUST_PHONE")
        private String customPhone;

        /**
         * 身份证号
         * Y
         */
        @JSONField(name = "ID_NO")
        private String idNo;

        /**
         * 申请件编号
         * Y
         */
        @JSONField(name = "APP_NO")
        private String appNo;

        /**
         * 统一信用代码
         * N
         */
        @JSONField(name = "Business_Regist_Num")
        private String uscCode;

        /**
         * 单位名称
         */
        @JSONField(name = "CORP_NAME")
        private String corpName;

        /**
         * 标识
         * 固定传Routing
         */
        @JSONField(name = "PROCESS_CODE")
        private String processCode = "Routing";

        /**
         * 资方
         * Y
         * 逗号分隔
         */
        @JSONField(name = "LONG_ORG_LIST")
        private String longOrgList;

        public String getCustomName() {
            return customName;
        }

        public void setCustomName(String customName) {
            this.customName = customName;
        }

        public String getCustomPhone() {
            return customPhone;
        }

        public void setCustomPhone(String customPhone) {
            this.customPhone = customPhone;
        }

        public String getIdNo() {
            return idNo;
        }

        public void setIdNo(String idNo) {
            this.idNo = idNo;
        }

        public String getAppNo() {
            return appNo;
        }

        public void setAppNo(String appNo) {
            this.appNo = appNo;
        }

        public String getUscCode() {
            return uscCode;
        }

        public void setUscCode(String uscCode) {
            this.uscCode = uscCode;
        }

        public String getCorpName() {
            return corpName;
        }

        public void setCorpName(String corpName) {
            this.corpName = corpName;
        }

        public String getProcessCode() {
            return processCode;
        }

        public void setProcessCode(String processCode) {
            this.processCode = processCode;
        }

        public String getLongOrgList() {
            return longOrgList;
        }

        public void setLongOrgList(String longOrgList) {
            this.longOrgList = longOrgList;
        }
    }
}
