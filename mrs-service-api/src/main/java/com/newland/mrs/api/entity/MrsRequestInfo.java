package com.newland.mrs.api.entity;

import com.newland.mrs.api.valid.annotation.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * MrsRequestInfo
 * mrs请求信息
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-27 12:02
 **/
public class MrsRequestInfo implements Serializable {

    private static final long serialVersionUID = 4621240645142845941L;

    /**
     * 接口调用方编号
     */
    @NotBlank(message = "接口调用方编号[apiInvokerCode]不能为空")
    private String apiInvokerCode;

    /**
     * 调用的接口名称
     */
    @NotBlank(message = "调用的接口名称[apiName]不能为空")
    private String apiName;

    /**
     * 签名方式
     */
    @NotBlank(message = "签名方式[signType]不能为空")
    @Pattern(regexp = "MD5", message = "签名方式[signType]只能是[MD5]其中一个")
    private String signType;

    /**
     * 签名值
     */
    @NotBlank(message = "签名值[signature]不能为空")
    @Length(value = 32, message = "签名值[signature]长度不得超过32")
    private String signature;

    /**
     * 规则编号
     */
    @NotBlank(message = "规则编号[ruleNo]不能为空")
    @Length(value = 32, message = "规则编号[ruleNo]长度不得超过32")
    private String ruleNo;

    /**
     * 请求业务数据
     */
    @NotNull(message = "请求业务数据[requestData]不能为空")
    private Object requestData;

    public String getApiInvokerCode() {
        return apiInvokerCode;
    }

    public void setApiInvokerCode(String apiInvokerCode) {
        this.apiInvokerCode = apiInvokerCode;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public Object getRequestData() {
        return requestData;
    }

    public void setRequestData(Object requestData) {
        this.requestData = requestData;
    }
}
