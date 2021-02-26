package com.newland.mrs.persist.model;

import java.io.Serializable;

public class MrsMktFunderMatch implements Serializable {
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
     * 事业部配置ID
     *
     * @mbg.generated
     */
    private Long divisionId;

    /**
     * 资金方配置id
     *
     * @mbg.generated
     */
    private Long mktFunderConfigId;

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
     * 资金方优先级
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     * 是否推送
     *
     * @mbg.generated
     */
    private String whetherToPush;

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

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public Long getMktFunderConfigId() {
        return mktFunderConfigId;
    }

    public void setMktFunderConfigId(Long mktFunderConfigId) {
        this.mktFunderConfigId = mktFunderConfigId;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getWhetherToPush() {
        return whetherToPush;
    }

    public void setWhetherToPush(String whetherToPush) {
        this.whetherToPush = whetherToPush;
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
        sb.append(", divisionId=").append(divisionId);
        sb.append(", mktFunderConfigId=").append(mktFunderConfigId);
        sb.append(", funderCode=").append(funderCode);
        sb.append(", funderName=").append(funderName);
        sb.append(", priority=").append(priority);
        sb.append(", whetherToPush=").append(whetherToPush);
        sb.append(", matchStatus=").append(matchStatus);
        sb.append(", hitSign=").append(hitSign);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}