package com.newland.mrs.impl.annotation;

import java.lang.annotation.*;

/**
 * DistributedLock
 * redis分布式锁注解
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-29 17:41
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DistributedLock {

    boolean off() default true;

    String bizKeyName();

    String redisRoot();

    int timeout() default 5 * 60;
}
