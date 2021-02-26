package com.newland.mrs.impl.annotation;

import java.lang.annotation.*;

/**
 * RequestVerify
 * 请求验证
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-29 15:07
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequestVerify {

    boolean isVerify() default true;
}
