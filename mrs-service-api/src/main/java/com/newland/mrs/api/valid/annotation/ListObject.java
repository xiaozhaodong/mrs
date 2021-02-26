package com.newland.mrs.api.valid.annotation;

import java.lang.annotation.*;

/**
 * ListObject
 * 集合对象校验
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-08 14:24
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ListObject {

    int minSize() default 0;

    int maxSize() default 0;

    String message();
}
