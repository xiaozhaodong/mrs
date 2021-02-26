package com.newland.mrs.impl.config.redis;

import com.newland.mrs.impl.util.SerializeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

import java.nio.charset.StandardCharsets;
import java.util.Collections;

/**
 * redis操作组件
 * @author xiaozhaodong
 */
@Component
public class RedisCacheManager {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final Long RELEASE_SUCCESS = 1L;

    private final JedisCluster jedisCluster;

    public RedisCacheManager(JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }

    /**
     * 将 key 的值设为 value ，当且仅当 key 不存在。且设置过期时间
     *
     * @param key
     * @param value
     * @param seconds
     * @return
     */
    public boolean lock(String key, String value, int seconds) {
        boolean result = false;
        try {
            String res = jedisCluster.set(key, value, "nx", "ex", seconds);
            if (res != null) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("redis.Lock()发生异常{}", e.getMessage());
        }
        return result;
    }

    /**
     * 释放锁
     *
     * @param key
     * @param value
     * @return
     */
    public boolean unlock(String key, String value) {
        boolean result = false;
        try {
            String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
            Object object = jedisCluster.eval(script, Collections.singletonList(key), Collections.singletonList(value));
            if (RELEASE_SUCCESS.equals(object)) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("redis.unLock()发生异常" + e.getMessage());
        }
        return result;
    }

    /**
     * set 字符串
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value) {
        String result = null;
        try {
            result = jedisCluster.set(key, value);
        } catch (Exception e) {
            logger.error("redis.set()发生异常" + e.getMessage());
        }
        return result;
    }

    /**
     * set 字符串并设置超时时间
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value, int seconds){
        String result = null;
        try {
            result = jedisCluster.setex(key, seconds, value);
        } catch (Exception e) {
            logger.error("redis.set()发生异常" + e.getMessage());
        }
        return result;
    }

    /**
     * get key值
     * @param key
     * @return
     */
    public String get(String key) {
        String result = null;
        try {
            result = jedisCluster.get(key);
        } catch (Exception e) {
            logger.error("redis.get()发生异常" + e.getMessage());
        }
        return result;
    }


    /**
     * 删除给定的一个key
     * @param key
     * @return
     */
    public Long del(String key) {
        Long result = null;
        try {
            result = jedisCluster.del(key);
        } catch (Exception e) {
            logger.error("redis.del()发生异常{}", e.getMessage());
        }
        return result;
    }

    /**
     * 指定key值自增1
     * @param key
     * @param field
     * @return
     */
    public Long incr(String key, String field) {
        Long result = null;
        try {
            result = jedisCluster.hincrBy(key, field, 1L);
        } catch (Exception e) {
            logger.error("redis.incr()发生异常" + e.getMessage());
        }
        return result;
    }

    /**
     * 指定key值自增长
     * @param key
     * @param value
     * @return
     */
    public Long incrBy(String key, long value) {
        Long result = null;
        try {
            result = jedisCluster.incrBy(key, value);
        } catch (Exception e) {
            logger.error("redis.incr()发生异常" + e.getMessage());
        }
        return result;
    }

    /**
     * 获取map类型值
     * @param key
     * @param field
     * @return
     */
    public String hGet(String key,String field) {
        String result = null;
        try {
            result = jedisCluster.hget(key, field);
        } catch (Exception e) {
            logger.error("redis.hGet()发生异常" + e.getMessage());
        }
        return result;
    }

    /**
     * 设置超市时间
     * @param key
     * @param timeout
     */
    public void expire(String key, int timeout) {
        try {
            jedisCluster.expire(key, timeout);
        } catch (Exception e) {
            logger.error("redis.expire()发生异常" + e.getMessage());
        }

    }
}
