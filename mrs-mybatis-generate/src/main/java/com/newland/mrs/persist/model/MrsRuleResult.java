package com.newland.mrs.persist.model;

import java.io.Serializable;

public class MrsRuleResult implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 业务编号
     *
     * @mbg.generated
     */
    private String businessNo;

    /**
     * 全局配置规则编号
     *
     * @mbg.generated
     */
    private String ruleNo;

    /**
     * 具体规则业务配置id
     *
     * @mbg.generated
     */
    private Long configId;

    /**
     * 规则组名
     *
     * @mbg.generated
     */
    private String ruleGroup;

    /**
     * 规则唯一编号
     *
     * @mbg.generated
     */
    private Long ruleId;

    /**
     * 规则编码
     *
     * @mbg.generated
     */
    private String ruleCode;

    /**
     * 规则名称
     *
     * @mbg.generated
     */
    private String ruleName;

    /**
     * 规则内容
     *
     * @mbg.generated
     */
    private String ruleContext;

    /**
     * 规则描述
     *
     * @mbg.generated
     */
    private String ruleDesc;

    /**
     * 是否外部数据源
     *
     * @mbg.generated
     */
    private String outDataSign;

    /**
     * 外部数据源获取执行bean
     *
     * @mbg.generated
     */
    private String outBeanName;

    /**
     * 外部获取的值
     *
     * @mbg.generated
     */
    private String outDataValue;

    /**
     * 规则优先级
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     * 规则匹配状态(INIT:初始化,GET_DATA_PROCESS:外部数据源获取中,
     *     GET_DATA_SUCCESS:外部数据源获取成功,GET_DATA_FAILURE:外部数据源获取失败,GET_DATA_ERROR:外部数据源获取异常,
     *     MATCH_ED:已匹配,UN_MATCH:未匹配)
     *
     * @mbg.generated
     */
    private String resultStatus;

    /**
     * 是否命中
     *
     * @mbg.generated
     */
    private String hitSign;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public String getRuleGroup() {
        return ruleGroup;
    }

    public void setRuleGroup(String ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleContext() {
        return ruleContext;
    }

    public void setRuleContext(String ruleContext) {
        this.ruleContext = ruleContext;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public String getOutDataSign() {
        return outDataSign;
    }

    public void setOutDataSign(String outDataSign) {
        this.outDataSign = outDataSign;
    }

    public String getOutBeanName() {
        return outBeanName;
    }

    public void setOutBeanName(String outBeanName) {
        this.outBeanName = outBeanName;
    }

    public String getOutDataValue() {
        return outDataValue;
    }

    public void setOutDataValue(String outDataValue) {
        this.outDataValue = outDataValue;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getHitSign() {
        return hitSign;
    }

    public void setHitSign(String hitSign) {
        this.hitSign = hitSign;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", businessNo=").append(businessNo);
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", configId=").append(configId);
        sb.append(", ruleGroup=").append(ruleGroup);
        sb.append(", ruleId=").append(ruleId);
        sb.append(", ruleCode=").append(ruleCode);
        sb.append(", ruleName=").append(ruleName);
        sb.append(", ruleContext=").append(ruleContext);
        sb.append(", ruleDesc=").append(ruleDesc);
        sb.append(", outDataSign=").append(outDataSign);
        sb.append(", outBeanName=").append(outBeanName);
        sb.append(", outDataValue=").append(outDataValue);
        sb.append(", priority=").append(priority);
        sb.append(", resultStatus=").append(resultStatus);
        sb.append(", hitSign=").append(hitSign);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}