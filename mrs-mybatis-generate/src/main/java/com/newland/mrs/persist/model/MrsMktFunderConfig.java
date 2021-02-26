package com.newland.mrs.persist.model;

import java.io.Serializable;

public class MrsMktFunderConfig implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 事业部配置ID
     *
     * @mbg.generated
     */
    private Long divisionId;

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
     * 是否推送
     *
     * @mbg.generated
     */
    private String whetherToPush;

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

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
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

    public String getWhetherToPush() {
        return whetherToPush;
    }

    public void setWhetherToPush(String whetherToPush) {
        this.whetherToPush = whetherToPush;
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
        sb.append(", divisionId=").append(divisionId);
        sb.append(", ruleNo=").append(ruleNo);
        sb.append(", funderCode=").append(funderCode);
        sb.append(", funderName=").append(funderName);
        sb.append(", whetherToPush=").append(whetherToPush);
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