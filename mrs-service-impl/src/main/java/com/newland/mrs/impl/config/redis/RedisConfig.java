package com.newland.mrs.impl.config.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * RedisConfig
 * redis配置
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-01 13:55
 **/
@Configuration
public class RedisConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final RedisProperties properties;

    public RedisConfig(RedisProperties properties) {
        this.properties = properties;
    }

    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(properties.getMaxTotal());
        jedisPoolConfig.setMaxIdle(properties.getMaxIdle());
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);
        return jedisPoolConfig;
    }

    @Bean
    public JedisCluster getRedisCluster() {
        logger.info("redis注入.........");
        String[] addresses = properties.getAddress().split(",");
        logger.info("redis集群:{}", Arrays.toString(addresses));
        Set<HostAndPort> hostAndPorts = new HashSet<>();
        for (String host : addresses) {
            String[] hosts = host.split(":");
            HostAndPort hostAndPort = new HostAndPort(hosts[0], Integer.parseInt(hosts[1]));
            hostAndPorts.add(hostAndPort);
        }
        return new JedisCluster(hostAndPorts, properties.getConnectionTimeout(), properties.getSoTimeout(), properties.getMaxAttempts(), properties.getPassword(), jedisPoolConfig());
    }
}
