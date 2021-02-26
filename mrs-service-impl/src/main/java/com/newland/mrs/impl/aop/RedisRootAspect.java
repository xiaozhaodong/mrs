package com.newland.mrs.impl.aop;

import com.newland.mrs.impl.config.redis.RedisProperties;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * RedisRootAspect
 * redis全局增加root目录
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-14 17:29
 **/
@Aspect
@Component
public class RedisRootAspect {


    private final RedisProperties redisProperties;

    public RedisRootAspect(RedisProperties redisProperties) {
        this.redisProperties = redisProperties;
    }

    @Pointcut("execution(public * com.newland.mrs.impl.config.redis.RedisCacheManager.*(..)) ")
    public void pointcut() {

    }

    @Around(value = "pointcut()")
    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        String key = String.valueOf(args[0]);
        args[0] = redisProperties.getRedisRootDir() + ":" + key;
        return pjp.proceed(args);
    }
}
