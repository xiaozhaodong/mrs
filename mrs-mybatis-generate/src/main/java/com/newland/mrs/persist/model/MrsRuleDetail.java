package com.newland.mrs.persist.model;

import java.io.Serializable;

public class MrsRuleDetail implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 具体的业务规则所属
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
     * 全局规则编号
     *
     * @mbg.generated
     */
    private String ruleNo;

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
     * 规则优先级
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     * 是否启用
     *
     * @mbg.generated
     */
    private String enable;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 更新人
     *
     * @mbg.generated
     */
    private String updateUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", configId=").append(configId);
        sb.append(", ruleGroup=").append(ruleGroup);
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", ruleCode=").append(ruleCode);
        sb.append(", ruleName=").append(ruleName);
        sb.append(", ruleContext=").append(ruleContext);
        sb.append(", ruleDesc=").append(ruleDesc);
        sb.append(", outDataSign=").append(outDataSign);
        sb.append(", outBeanName=").append(outBeanName);
        sb.append(", priority=").append(priority);
        sb.append(", enable=").append(enable);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}