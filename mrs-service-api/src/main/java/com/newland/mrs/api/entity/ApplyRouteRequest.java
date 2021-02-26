package com.newland.mrs.api.entity;

import com.newland.mrs.api.valid.annotation.Date;
import com.newland.mrs.api.valid.annotation.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * ApplyRouteRequest
 * 路由申请请求描述
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-27 14:02
 **/
public class ApplyRouteRequest implements Serializable {

    private static final long serialVersionUID = 3632876227209319449L;

    /**
     * 路由申请编号
     */
    @NotBlank(message = "路由申请编号[routeNo]不能为空")
    @Length(value = 64, message = "路由申请编号[routeNo]长度不得超过64")
    private String routeNo;

    /**
     * 进件申请编号
     */
    @NotBlank(message = "进件申请编号[applyNo]不能为空")
    @Length(value = 64, message = "进件申请编号[applyNo]长度不得超过64")
    private String applyNo;

    /**
     * 申请客户姓名
     */
    @NotBlank(message = "申请客户姓名[customName]不能为空")
    @Length(value = 100, message = "申请客户姓名[customName]长度不得超过100")
    private String customName;

    /**
     * 客户手机号码
     */
    @NotBlank(message = "客户手机号码[customPhone]不能为空")
    @Length(value = 20, message = "客户手机号码[customPhone]长度不得超过20")
    private String customPhone;

    /**
     * 客户身份证号码
     */
    @NotBlank(message = "客户身份证号码[customIdNo]不能为空")
    @Length(value = 32, message = "客户身份证号码[customIdNo]长度不得超过32")
    private String customIdNo;

    /**
     * 客户银行卡号码
     */
    @NotBlank(message = "客户银行卡号码[bankCardNo]不能为空")
    @Length(value = 32, message = "客户银行卡号码[bankCardNo]长度不得超过32")
    private String bankCardNo;

    /**
     * 客户在贷余额(单位分)
     */
    @NotBlank(message = "客户在贷余额[customBalance]不能为空")
    @Pattern(regexp = "^[+]?(\\d+)$", message = "客户在贷余额[customBalance]只能是包含零正整数")
    private String customBalance;

    /**
     * 客户在贷笔数
     */
    @NotBlank(message = "客户在贷笔数[customLimit]不能为空")
    @Pattern(regexp = "^[1-9]\\d*$", message = "客户在贷笔数[customLimit]只能是不包含零正整数")
    private String customLimit;

    /**
     * 授信额度
     */
    @NotBlank(message = "授信额度[creditAmount]不能为空")
    @Pattern(regexp = "^[1-9]\\d*$", message = "授信额度[creditAmount]只能是不包含零正整数")
    private String creditAmount;

    /**
     * 申请的金额
     */
    @NotBlank(message = "申请的金额[applyAmount]不能为空")
    @Pattern(regexp = "^[1-9]\\d*$", message = "申请的金额[applyAmount]只能是不包含零正整数")
    private String applyAmount;

    /**
     * 申请的产品利率
     */
    @NotBlank(message = "申请的产品利率[applyRate]不能为空")
    @Pattern(regexp = "(^0\\.[0-9]{1,6}$)(?<!0)", message = "申请的产品利率[applyAmount]只能0-1之间的小数最多保留6位且最后一位小数不能是0")
    private String applyRate;

    /**
     * 申请的年龄
     */
    @NotBlank(message = "申请的年龄[applyAge]不能为空")
    @Pattern(regexp = "^[1-9]\\d*$", message = "申请的年龄[applyAge]只能是不包含零正整数")
    private String applyAge;

    /**
     * 产品申请期限始
     */
    @NotBlank(message = "产品申请期限始[limitStartDate]不能为空")
    @Date(format = "yyyy-MM-dd", message = "产品申请期限始[limitStartDate]格式不正确")
    private String limitStartDate;

    /**
     * 产品申请期限止
     */
    @NotBlank(message = "产品申请期限止[limitEndDate]不能为空")
    @Date(format = "yyyy-MM-dd", message = "产品申请期限止[limitEndDate]格式不正确")
    private String limitEndDate;

    /**
     * 产品类型
     */
    @NotBlank(message = "产品类型[applyProductType]不能为空")
    @Length(value = 20, message = "产品类型[applyProductType]长度不得超过20")
    private String applyProductType;

    /**
     * 产品期数
     */
    @NotBlank(message = "产品期数[applyProductTerm]不能为空")
    @Pattern(regexp = "^[1-9]\\d*$", message = "产品期数[applyProductTerm]只能是不包含零正整数")
    private String applyProductTerm;

    /**
     * 申请的还款方式
     */
    @NotBlank(message = "申请的还款方式[applyRepayType]不能为空")
    @Pattern(regexp = "DEBX|DEBJ|YCXHBFX", message = "申请的还款方式[applyRepayType]只能是[DEBX|DEBJ|YCXHBFX]其中一个")
    private String applyRepayType;

    /**
     * 名企微贷标识
     */
    @NotBlank(message = "名企微贷标识[microCreditSign]不能为空")
    @Pattern(regexp = "Y|N", message = "名企微贷标识[microCreditSign]只能是[Y|N]其中一个")
    private String microCreditSign;

    /**
     * 线上/线下标识
     */
    @NotBlank(message = "线上/线下标识[lineSign]不能为空")
    @Pattern(regexp = "ONLINE|OFFLINE", message = "线上/线下标识[microCreditSign]只能是[ONLINE|OFFLINE]其中一个")
    private String lineSign;

    /**
     * 事业部编号(线下必须)
     */
    @Length(value = 32, message = "事业部编号[divisionCode]长度不得超过32")
    private String divisionCode;

    /**
     * 事业部名称
     */
    @Length(value = 50, message = "事业部编号[divisionName]长度不得超过50")
    private String divisionName;

    /**
     * 事业部下的团队编号(线下必须)
     */
    @Length(value = 32, message = "事业部下的团队编号[teamCode]长度不得超过32")
    private String teamCode;

    /**
     * 事业部下的团队名称
     */
    @Length(value = 50, message = "事业部下的团队名称[teamName]长度不得超过50")
    private String teamName;

    /**
     * 个人/企业
     */
    @NotBlank(message = "个人/企业[personalOrEnterprise]不能为空")
    @Pattern(regexp = "PERSONAL|ENTERPRISE", message = "个人/企业[personalOrEnterprise]只能是[PERSONAL|ENTERPRISE]其中一个")
    private String personalOrEnterprise;

    /**
     * 统一社会信用编码(企业必传)
     */
    @Length(value = 32, message = "统一社会信用编码[uscCode]长度不得超过32")
    private String uscCode;

    /**
     * 申请人群
     */
    @NotBlank(message = "申请人群[applyCrowd]不能为空")
    @Pattern(regexp = "A|B|C|D|E", message = "申请人群[applyCrowd]只能是[A|B|C|D|E]其中一个")
    private String applyCrowd;

    /**
     * 身份证地址
     */
    @Length(value = 256, message = "身份证地址[idCardAddress]长度不得超过256")
    private String idCardAddress;

    /**
     * 住宅地址
     */
    @Length(value = 256, message = "住宅地址[homeAddress]长度不得超过256")
    private String homeAddress;

    /**
     * 营业执造地址
     */
    @Length(value = 256, message = "营业执造地址[businessAddress]长度不得超过256")
    private String businessAddress;

    /**
     * 实际经营地址
     */
    @Length(value = 256, message = "实际经营地址[manageAddress]长度不得超过256")
    private String manageAddress;

    /**
     * 公司名称
     */
    @NotBlank(message = "公司名称[companyName]不能为空")
    @Length(value = 100, message = "公司名称[companyName]长度不得超过100")
    private String companyName;

    /**
     * 公司地址
     */
    @Length(value = 256, message = "公司地址[companyAddress]长度不得超过256")
    private String companyAddress;

    /**
     * 小微/消费
     */
    @NotBlank(message = "小微/消费[microOrConsume]不能为空")
    @Pattern(regexp = "MICRO|CONSUME", message = "小微/消费[microOrConsume]只能是[MICRO|CONSUME]其中一个")
    private String microOrConsume;

    /**
     * 已收集到的文件资料的种类
     */
    @NotBlank(message = "已收集到的文件资料的种类[haveFileType]不能为空")
    @Length(value = 20, message = "已收集到的文件资料的种类[haveFileType]长度不得超过20")
    private String haveFileType;

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
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

    public String getCustomBalance() {
        return customBalance;
    }

    public void setCustomBalance(String customBalance) {
        this.customBalance = customBalance;
    }

    public String getCustomLimit() {
        return customLimit;
    }

    public void setCustomLimit(String customLimit) {
        this.customLimit = customLimit;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(String applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getApplyRate() {
        return applyRate;
    }

    public void setApplyRate(String applyRate) {
        this.applyRate = applyRate;
    }

    public String getApplyAge() {
        return applyAge;
    }

    public void setApplyAge(String applyAge) {
        this.applyAge = applyAge;
    }

    public String getLimitStartDate() {
        return limitStartDate;
    }

    public void setLimitStartDate(String limitStartDate) {
        this.limitStartDate = limitStartDate;
    }

    public String getLimitEndDate() {
        return limitEndDate;
    }

    public void setLimitEndDate(String limitEndDate) {
        this.limitEndDate = limitEndDate;
    }

    public String getApplyProductType() {
        return applyProductType;
    }

    public void setApplyProductType(String applyProductType) {
        this.applyProductType = applyProductType;
    }

    public String getApplyProductTerm() {
        return applyProductTerm;
    }

    public void setApplyProductTerm(String applyProductTerm) {
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
}
