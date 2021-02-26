package com.newland.mrs.persist.model;

import java.io.Serializable;
import java.util.Date;

public class MrsFunderMatch implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 进件路由编号
     *
     * @mbg.generated
     */
    private String routeNo;

    /**
     * 路由规则编号
     *
     * @mbg.generated
     */
    private String ruleNo;

    /**
     * 资金方配置id
     *
     * @mbg.generated
     */
    private Long funderConfigId;

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
     * 匹配状态
     *
     * @mbg.generated
     */
    private String matchStatus;

    /**
     * 是否命中
     *
     * @mbg.generated
     */
    private String hitSign;

    /**
     * 风控结果
     *
     * @mbg.generated
     */
    private String riskResult;

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

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public Long getFunderConfigId() {
        return funderConfigId;
    }

    public void setFunderConfigId(Long funderConfigId) {
        this.funderConfigId = funderConfigId;
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

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getHitSign() {
        return hitSign;
    }

    public void setHitSign(String hitSign) {
        this.hitSign = hitSign;
    }

    public String getRiskResult() {
        return riskResult;
    }

    public void setRiskResult(String riskResult) {
        this.riskResult = riskResult;
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
        sb.append(", routeNo=").append(routeNo);
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", funderConfigId=").append(funderConfigId);
        sb.append(", funderCode=").append(funderCode);
        sb.append(", funderName=").append(funderName);
        sb.append(", preserveStartTime=").append(preserveStartTime);
        sb.append(", preserveEndTime=").append(preserveEndTime);
        sb.append(", loanStartTime=").append(loanStartTime);
        sb.append(", loanEndTime=").append(loanEndTime);
        sb.append(", batchStartTime=").append(batchStartTime);
        sb.append(", priority=").append(priority);
        sb.append(", matchStatus=").append(matchStatus);
        sb.append(", hitSign=").append(hitSign);
        sb.append(", riskResult=").append(riskResult);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}