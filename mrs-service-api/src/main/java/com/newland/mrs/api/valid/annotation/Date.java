package com.newland.mrs.api.valid.annotation;


import com.newland.mrs.api.valid.validator.DateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 日期格式校验
 * @author xiaozhaodong
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DateValidator.class})
public @interface Date {

    String message() default "日期格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String format();
}
