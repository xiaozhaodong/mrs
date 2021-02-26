package com.newland.mrs.persist.model;

import java.io.Serializable;
import java.util.Date;

public class MrsFunderConfig implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 规则编号
     *
     * @mbg.generated
     */
    private String ruleNo;

    /**
     * 资金方编号
     *
     * @mbg.generated
     */
    private String funderCode;

    /**
     * 资金方名称
     *
     * @mbg.generated
     */
    private String funderName;

    /**
     * 资金方系统维护时间始
     *
     * @mbg.generated
     */
    private Date preserveStartTime;

    /**
     * 资金方系统维护时间止
     *
     * @mbg.generated
     */
    private Date preserveEndTime;

    /**
     * 资金方放款时间始
     *
     * @mbg.generated
     */
    private Date loanStartTime;

    /**
     * 资金方放款时间止
     *
     * @mbg.generated
     */
    private Date loanEndTime;

    /**
     * 资金方批扣时间
     *
     * @mbg.generated
     */
    private Date batchStartTime;

    /**
     * 资金方优先级
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

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public String getFunderCode() {
        return funderCode;
    }

    public void setFunderCode(String funderCode) {
        this.funderCode = funderCode;
    }

    public String getFunderName() {
        return funderName;
    }

    public void setFunderName(String funderName) {
        this.funderName = funderName;
    }

    public Date getPreserveStartTime() {
        return preserveStartTime;
    }

    public void setPreserveStartTime(Date preserveStartTime) {
        this.preserveStartTime = preserveStartTime;
    }

    public Date getPreserveEndTime() {
        return preserveEndTime;
    }

    public void setPreserveEndTime(Date preserveEndTime) {
        this.preserveEndTime = preserveEndTime;
    }

    public Date getLoanStartTime() {
        return loanStartTime;
    }

    public void setLoanStartTime(Date loanStartTime) {
        this.loanStartTime = loanStartTime;
    }

    public Date getLoanEndTime() {
        return loanEndTime;
    }

    public void setLoanEndTime(Date loanEndTime) {
        this.loanEndTime = loanEndTime;
    }

    public Date getBatchStartTime() {
        return batchStartTime;
    }

    public void setBatchStartTime(Date batchStartTime) {
        this.batchStartTime = batchStartTime;
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
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", funderCode=").append(funderCode);
        sb.append(", funderName=").append(funderName);
        sb.append(", preserveStartTime=").append(preserveStartTime);
        sb.append(", preserveEndTime=").append(preserveEndTime);
        sb.append(", loanStartTime=").append(loanStartTime);
        sb.append(", loanEndTime=").append(loanEndTime);
        sb.append(", batchStartTime=").append(batchStartTime);
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