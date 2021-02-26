package com.newland.mrs.impl.enums;

/**
 * ResultStatusEnum
 * 规则匹配结果枚举
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 11:10
 **/
public enum ResultStatusEnum {
    /**
     * 未匹配(待处理)
     */
    UN_MATCH("UN_MATCH", "未匹配(待匹配)"),

    /**
     * 已匹配
     */
    MATCH_ED("MATCH_ED", "已匹配"),
    ;

    private String code;

    private String name;

    ResultStatusEnum(String code, String name) {
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
