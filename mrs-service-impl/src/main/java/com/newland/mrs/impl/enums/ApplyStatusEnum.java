package com.newland.mrs.impl.enums;

/**
 * ApplyStatusEnum
 * 路由申请状态枚举
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 11:01
 **/
public enum ApplyStatusEnum {
    /**
     * 初始化(待处理)
     */
    INIT("INIT", "初始化(待处理)"),

    /**
     *资金方要素匹配完成
     */
    FUNDER_MATCH_EN("FUNDER_MATCH_EN", "资金方要素匹配完成"),

    /**
     * 已经推送风控处理
     */
    PUSH_RISK_PROCESS("PUSH_RISK_PROCESS", "已经推送风控处理"),

    /**
     * 推送风控处理失败
     */
    PUSH_RISK_FAILURE("PUSH_RISK_FAILURE", "推送风控处理失败"),

    /**
     * 推送风控处理异常
     */
    PUSH_RISK_ERROR("PUSH_RISK_ERROR", "推送风控处理异常"),

    /**
     * 推送风控处理完成
     */
    PUSH_RISK_COMPLETE("PUSH_RISK_COMPLETE", "推送风控处理完成"),

    /**
     * 路由完成
     */
    ROUTE_COMPLETE("ROUTE_COMPLETE", "路由选择完成"),
    ;

    private String code;

    private String name;

    ApplyStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
