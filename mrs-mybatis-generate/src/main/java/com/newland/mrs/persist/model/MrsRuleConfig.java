package com.newland.mrs.persist.model;

import java.io.Serializable;

public class MrsRuleConfig implements Serializable {
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
     * 规则说明
     *
     * @mbg.generated
     */
    private String ruleDesc;

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

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
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
        sb.append(", ruleDesc=").append(ruleDesc);
        sb.append(", enable=").append(enable);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}