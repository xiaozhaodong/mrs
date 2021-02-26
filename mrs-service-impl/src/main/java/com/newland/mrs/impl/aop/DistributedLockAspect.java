package com.newland.mrs.impl.aop;

import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;
import com.newland.mrs.impl.annotation.DistributedLock;
import com.newland.mrs.impl.config.redis.RedisCacheManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * DistributedLockAspect
 * redis分布式锁aop
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-29 17:44
 **/
@Aspect
@Component
public class DistributedLockAspect {

    private static final Logger logger = LoggerFactory.getLogger(DistributedLockAspect.class);

    private final RedisCacheManager redisCacheManager;

    public DistributedLockAspect(RedisCacheManager redisCacheManager) {
        this.redisCacheManager = redisCacheManager;
    }

    @Pointcut("execution(public * *(..)) && @annotation(com.newland.mrs.impl.annotation.DistributedLock)")
    public void pointcut() {

    }

    @Around(value = "pointcut()")
    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method targetMethod = methodSignature.getMethod();
        String beanName = targetMethod.getDeclaringClass().getName();
        DistributedLock distributedLock = targetMethod.getAnnotation(DistributedLock.class);
        if (distributedLock != null && distributedLock.off()) {
            Object[] args = pjp.getArgs();
            MrsRequestInfo requestInfo = ((MrsRequestInfo) args[0]);
            Field field = requestInfo.getRequestData().getClass().getDeclaredField(distributedLock.bizKeyName());
            field.setAccessible(true);
            String bizKeyValue = String.valueOf(field.get(requestInfo.getRequestData()));
            String key = distributedLock.redisRoot() + ":" + bizKeyValue;
            boolean lock = redisCacheManager.lock(key, "1", distributedLock.timeout());
            if (lock) {
                logger.info("调用bean:{},方法:{},业务key:{},加锁", beanName, targetMethod.getName(), bizKeyValue);
                try {
                    return pjp.proceed();
                } finally {
                    redisCacheManager.unlock(key, "1");
                    logger.info("调用bean:{},方法:{},业务key:{},锁释放", beanName, targetMethod.getName(), bizKeyValue);
                }
            } else {
                logger.info("调用bean:{},方法:{},业务key:{},正在处理中", beanName, targetMethod.getName(), bizKeyValue);
                return MrsResponseInfo.newFailure("E100", "处理中勿重复提交");
            }
        } else {
            return pjp.proceed();
        }
    }
}
