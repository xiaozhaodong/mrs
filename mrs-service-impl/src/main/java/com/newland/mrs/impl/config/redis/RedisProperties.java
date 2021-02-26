package com.newland.mrs.impl.config.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * RedisProperties
 * redis配置文件
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-01 13:56
 **/
@Configuration
@ConfigurationProperties(prefix = "mrs.redis")
public class RedisProperties {

    private int maxTotal;

    private int maxIdle;

    private String address;

    private int connectionTimeout;

    private int soTimeout;

    private int maxAttempts;

    private String password;

    private String redisRootDir;

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRedisRootDir() {
        return redisRootDir;
    }

    public void setRedisRootDir(String redisRootDir) {
        this.redisRootDir = redisRootDir;
    }
}
