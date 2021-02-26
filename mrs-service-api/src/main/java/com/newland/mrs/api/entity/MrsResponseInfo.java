package com.newland.mrs.api.entity;

import java.io.Serializable;

/**
 * MrsResponseInfo
 * mrs响应信息
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 15:56
 **/
public class MrsResponseInfo implements Serializable {

    private static final long serialVersionUID = -8017005607097675641L;

    public static final String SUCCESS_CODE = "0000";

    private String responseCode;

    private String responseMessage;

    private Object responseData;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Object getResponseData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }

    /**
     * 判断返回结果是否成功
     */
    public boolean success() {
        return SUCCESS_CODE.equals(responseCode);
    }

    /**
     * 判断返回结果是否有结果对象
     */
    public boolean hasObject() {
        return SUCCESS_CODE.equals(responseCode) && responseData != null;
    }

    /**
     * 接口调用成功，不需要返回对象
     */
    public static MrsResponseInfo newSuccess() {
        MrsResponseInfo responseInfo = new MrsResponseInfo();
        responseInfo.setResponseCode(SUCCESS_CODE);
        responseInfo.setResponseMessage("处理成功");
        return responseInfo;
    }

    /**
     * 接口调用成功，有返回对象
     */
    public static MrsResponseInfo newSuccess(Object object) {
        MrsResponseInfo responseInfo = new MrsResponseInfo();
        responseInfo.setResponseCode(SUCCESS_CODE);
        responseInfo.setResponseMessage("处理成功");
        responseInfo.setResponseData(object);
        return responseInfo;
    }

    /**
     * 接口调用成功，有返回对象
     */
    public static MrsResponseInfo newSuccess(String code, String message, Object object) {
        MrsResponseInfo responseInfo = new MrsResponseInfo();
        responseInfo.setResponseCode(code);
        responseInfo.setResponseMessage(message);
        responseInfo.setResponseData(object);
        return responseInfo;
    }

    /**
     * 接口调用失败，有错误字符串码和描述，没有返回对象
     */
    public static MrsResponseInfo newFailure(String code, String message){
        MrsResponseInfo responseInfo = new MrsResponseInfo();
        responseInfo.setResponseCode(code);
        responseInfo.setResponseMessage(message);
        return responseInfo;
    }

    /**
     * 接口调用失败，有错误字符串码和描述，有返回对象
     */
    public static MrsResponseInfo newFailure(String code, String message, Object object){
        MrsResponseInfo responseInfo = new MrsResponseInfo();
        responseInfo.setResponseCode(code);
        responseInfo.setResponseMessage(message);
        responseInfo.setResponseData(object);
        return responseInfo;
    }
}
