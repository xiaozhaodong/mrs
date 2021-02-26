package com.newland.mrs.api.valid.validator;



import com.newland.mrs.api.valid.annotation.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 请求参数日期格式校验
 * @author xiaozhaodong
 */
public class DateValidator implements ConstraintValidator<Date, String> {

    private String format;

    @Override
    public void initialize(Date constraintAnnotation) {
        this.format = constraintAnnotation.format();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || ("").equals(s)) {
            return true;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            sdf.parse(s);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
