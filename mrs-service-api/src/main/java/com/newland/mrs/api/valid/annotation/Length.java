package com.newland.mrs.api.valid.annotation;



import com.newland.mrs.api.valid.validator.LengthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 参数长度效验
 * @author xiaozhaodong
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {LengthValidator.class})
public @interface Length {

    String message() default "字段长度不合法";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();

}
