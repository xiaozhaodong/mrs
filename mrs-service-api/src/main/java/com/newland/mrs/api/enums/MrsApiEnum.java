package com.newland.mrs.api.enums;

/**
 * MrsApiEnum
 * mrs 接口枚举
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 17:35
 **/
public enum MrsApiEnum {

    /**
     * 路由申请接口
     */
    applyRoute("applyRote", "路由申请接口"),
    ;

    private String code;

    private String name;

    MrsApiEnum(String code, String name) {
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
