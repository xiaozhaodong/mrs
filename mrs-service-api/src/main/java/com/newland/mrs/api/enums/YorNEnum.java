package com.newland.mrs.api.enums;

/**
 * YorNEnum
 * y和n枚举
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-01 09:51
 **/
public enum YorNEnum {
    /**
     * 是 or 否枚举
     */
    Y("Y", "是"),
    N("N", "否")
    ;

    private String code;

    private String name;

    YorNEnum(String code, String name) {
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
