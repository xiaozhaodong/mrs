package com.newland.mrs.persist.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MrsApplyRoute implements Serializable {
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
     * 规则编号
     *
     * @mbg.generated
     */
    private String ruleNo;

    /**
     * 进件申请编号
     *
     * @mbg.generated
     */
    private String applyNo;

    /**
     * 申请路由日期
     *
     * @mbg.generated
     */
    private Date routeDate;

    /**
     * 申请客户姓名
     *
     * @mbg.generated
     */
    private String customName;

    /**
     * 申请客户手机号码
     *
     * @mbg.generated
     */
    private String customPhone;

    /**
     * 申请客户的身份证号码
     *
     * @mbg.generated
     */
    private String customIdNo;

    /**
     * 申请客户的银行卡号码
     *
     * @mbg.generated
     */
    private String bankCardNo;

    /**
     * 客户在贷余额
     *
     * @mbg.generated
     */
    private Long customBalance;

    /**
     * 客户在贷笔数
     *
     * @mbg.generated
     */
    private Integer customLimit;

    /**
     * 客户的授信额度
     *
     * @mbg.generated
     */
    private Long creditAmount;

    /**
     * 申请的金额
     *
     * @mbg.generated
     */
    private Long applyAmount;

    /**
     * 申请产品利率
     *
     * @mbg.generated
     */
    private BigDecimal applyRate;

    /**
     * 申请的年龄
     *
     * @mbg.generated
     */
    private Integer applyAge;

    /**
     * 产品申请期限始
     *
     * @mbg.generated
     */
    private Date limitStartDate;

    /**
     * 产品申请期限止
     *
     * @mbg.generated
     */
    private Date limitEndDate;

    /**
     * 产品类型
     *
     * @mbg.generated
     */
    private String applyProductType;

    /**
     * 产品期数
     *
     * @mbg.generated
     */
    private Integer applyProductTerm;

    /**
     * 申请的还款方式
     *
     * @mbg.generated
     */
    private String applyRepayType;

    /**
     * 名企微贷标识
     *
     * @mbg.generated
     */
    private String microCreditSign;

    /**
     * 线上/线下
     *
     * @mbg.generated
     */
    private String lineSign;

    /**
     * 事业部编号
     *
     * @mbg.generated
     */
    private String divisionCode;

    /**
     * 事业部名称
     *
     * @mbg.generated
     */
    private String divisionName;

    /**
     * 事业部下的团队编号
     *
     * @mbg.generated
     */
    private String teamCode;

    /**
     * 事业部下的团队名称
     *
     * @mbg.generated
     */
    private String teamName;

    /**
     * 团队配置信息ID
     *
     * @mbg.generated
     */
    private Long divisionId;

    /**
     * 个人/企业
     *
     * @mbg.generated
     */
    private String personalOrEnterprise;

    /**
     * 统一社会信用编码
     *
     * @mbg.generated
     */
    private String uscCode;

    /**
     * 申请人群
     *
     * @mbg.generated
     */
    private String applyCrowd;

    /**
     * 身份证地址
     *
     * @mbg.generated
     */
    private String idCardAddress;

    /**
     * 住宅地址
     *
     * @mbg.generated
     */
    private String homeAddress;

    /**
     * 营业执造地址
     *
     * @mbg.generated
     */
    private String businessAddress;

    /**
     * 实际经营地址
     *
     * @mbg.generated
     */
    private String manageAddress;

    /**
     * 公司名称
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     * 公司地址
     *
     * @mbg.generated
     */
    private String companyAddress;

    /**
     * 小微/消费
     *
     * @mbg.generated
     */
    private String microOrConsume;

    /**
     * 已经拥有的文件的种类
     *
     * @mbg.generated
     */
    private String haveFileType;

    /**
     * 路由状态
     *
     * @mbg.generated
     */
    private String applyStatus;

    /**
     * 资金方推送结果
     *
     * @mbg.generated
     */
    private String funderResult;

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

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public Date getRouteDate() {
        return routeDate;
    }

    public void setRouteDate(Date routeDate) {
        this.routeDate = routeDate;
    }

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

    public String getCustomIdNo() {
        return customIdNo;
    }

    public void setCustomIdNo(String customIdNo) {
        this.customIdNo = customIdNo;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public Long getCustomBalance() {
        return customBalance;
    }

    public void setCustomBalance(Long customBalance) {
        this.customBalance = customBalance;
    }

    public Integer getCustomLimit() {
        return customLimit;
    }

    public void setCustomLimit(Integer customLimit) {
        this.customLimit = customLimit;
    }

    public Long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Long getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Long applyAmount) {
        this.applyAmount = applyAmount;
    }

    public BigDecimal getApplyRate() {
        return applyRate;
    }

    public void setApplyRate(BigDecimal applyRate) {
        this.applyRate = applyRate;
    }

    public Integer getApplyAge() {
        return applyAge;
    }

    public void setApplyAge(Integer applyAge) {
        this.applyAge = applyAge;
    }

    public Date getLimitStartDate() {
        return limitStartDate;
    }

    public void setLimitStartDate(Date limitStartDate) {
        this.limitStartDate = limitStartDate;
    }

    public Date getLimitEndDate() {
        return limitEndDate;
    }

    public void setLimitEndDate(Date limitEndDate) {
        this.limitEndDate = limitEndDate;
    }

    public String getApplyProductType() {
        return applyProductType;
    }

    public void setApplyProductType(String applyProductType) {
        this.applyProductType = applyProductType;
    }

    public Integer getApplyProductTerm() {
        return applyProductTerm;
    }

    public void setApplyProductTerm(Integer applyProductTerm) {
        this.applyProductTerm = applyProductTerm;
    }

    public String getApplyRepayType() {
        return applyRepayType;
    }

    public void setApplyRepayType(String applyRepayType) {
        this.applyRepayType = applyRepayType;
    }

    public String getMicroCreditSign() {
        return microCreditSign;
    }

    public void setMicroCreditSign(String microCreditSign) {
        this.microCreditSign = microCreditSign;
    }

    public String getLineSign() {
        return lineSign;
    }

    public void setLineSign(String lineSign) {
        this.lineSign = lineSign;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public String getPersonalOrEnterprise() {
        return personalOrEnterprise;
    }

    public void setPersonalOrEnterprise(String personalOrEnterprise) {
        this.personalOrEnterprise = personalOrEnterprise;
    }

    public String getUscCode() {
        return uscCode;
    }

    public void setUscCode(String uscCode) {
        this.uscCode = uscCode;
    }

    public String getApplyCrowd() {
        return applyCrowd;
    }

    public void setApplyCrowd(String applyCrowd) {
        this.applyCrowd = applyCrowd;
    }

    public String getIdCardAddress() {
        return idCardAddress;
    }

    public void setIdCardAddress(String idCardAddress) {
        this.idCardAddress = idCardAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getManageAddress() {
        return manageAddress;
    }

    public void setManageAddress(String manageAddress) {
        this.manageAddress = manageAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getMicroOrConsume() {
        return microOrConsume;
    }

    public void setMicroOrConsume(String microOrConsume) {
        this.microOrConsume = microOrConsume;
    }

    public String getHaveFileType() {
        return haveFileType;
    }

    public void setHaveFileType(String haveFileType) {
        this.haveFileType = haveFileType;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getFunderResult() {
        return funderResult;
    }

    public void setFunderResult(String funderResult) {
        this.funderResult = funderResult;
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
        sb.append(", applyNo=").append(applyNo);
        sb.append(", routeDate=").append(routeDate);
        sb.append(", customName=").append(customName);
        sb.append(", customPhone=").append(customPhone);
        sb.append(", customIdNo=").append(customIdNo);
        sb.append(", bankCardNo=").append(bankCardNo);
        sb.append(", customBalance=").append(customBalance);
        sb.append(", customLimit=").append(customLimit);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", applyAmount=").append(applyAmount);
        sb.append(", applyRate=").append(applyRate);
        sb.append(", applyAge=").append(applyAge);
        sb.append(", limitStartDate=").append(limitStartDate);
        sb.append(", limitEndDate=").append(limitEndDate);
        sb.append(", applyProductType=").append(applyProductType);
        sb.append(", applyProductTerm=").append(applyProductTerm);
        sb.append(", applyRepayType=").append(applyRepayType);
        sb.append(", microCreditSign=").append(microCreditSign);
        sb.append(", lineSign=").append(lineSign);
        sb.append(", divisionCode=").append(divisionCode);
        sb.append(", divisionName=").append(divisionName);
        sb.append(", teamCode=").append(teamCode);
        sb.append(", teamName=").append(teamName);
        sb.append(", divisionId=").append(divisionId);
        sb.append(", personalOrEnterprise=").append(personalOrEnterprise);
        sb.append(", uscCode=").append(uscCode);
        sb.append(", applyCrowd=").append(applyCrowd);
        sb.append(", idCardAddress=").append(idCardAddress);
        sb.append(", homeAddress=").append(homeAddress);
        sb.append(", businessAddress=").append(businessAddress);
        sb.append(", manageAddress=").append(manageAddress);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", microOrConsume=").append(microOrConsume);
        sb.append(", haveFileType=").append(haveFileType);
        sb.append(", applyStatus=").append(applyStatus);
        sb.append(", funderResult=").append(funderResult);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}