package com.newland.mrs.impl.config.seq;

import com.newland.mrs.impl.config.redis.RedisCacheManager;
import com.newland.mrs.impl.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;


/**
 * id生成组件
 * @author xiaozhaodong
 */
@Component
@Scope("singleton")
public class IdGenerator {

    private static final Logger logger = LoggerFactory.getLogger(IdGenerator.class);

    private IdWorker idWorker;

    private final RedisCacheManager redisCacheManager;

    public IdGenerator(RedisCacheManager redisCacheManager) {
        this.redisCacheManager = redisCacheManager;
    }

    @PostConstruct
    public void init() {
        logger.info("初始化雪花算法类");
        long workerId = redisCacheManager.incrBy("workerId", 1L);
        redisCacheManager.expire("workerId", 60 * 60);
        workerId %= 1024L;
        long dataCenterId = redisCacheManager.incrBy("dataCenterId", 1L);
        redisCacheManager.expire( "dataCenterId", 60 * 60);
        dataCenterId %= 1024L;
        logger.info("初始化SnowFlake workerId:{},dataCenterId:{}", workerId, dataCenterId);
        idWorker = new IdWorker(workerId, dataCenterId);
    }

    /**
     * 获取一个雪花算法ID
     *
     * @return
     */
    public String getSnowflakeNo() {
        long nextId = idWorker.nextId();
        return nextId + "";
    }

    /**
     * 根据交易渠道获取交易订单号
     * 渠道名+yyyyMMddHHmmss+八位自增序列
     *
     * @param channelId
     * @return
     */
    public String getChannelOrderId(String channelId) {
        String dateStr = DateUtils.dateToString(new Date(), "yyyyMMdd");
        Long seqId = redisCacheManager.incr( "orderId:" + channelId, dateStr);
        dateStr = DateUtils.dateToString(new Date(), "yyyyMMddHHmmss");
        return  dateStr + channelId + String.format("%08d", seqId);
    }

    /**
     * 获取资金方授信或者放款编号
     * @param funderCode 资金方编码
     * @param op 操作类型 放款FK 授信SK
     * @param channelCode 渠道代码
     * @return 唯一编码
     */
    public String getFunderApplyNo(String funderCode, String op, String channelCode) {
        String dateStr = DateUtils.dateToString(new Date(), "yyyyMMdd");
        Long seqId = redisCacheManager.incr( funderCode + ":" + op + ":applyNo" , dateStr);
        dateStr = DateUtils.dateToString(new Date(), "yyyyMMddHHmm");
        return op + channelCode + dateStr + String.format("%08d", seqId);
    }

    /**
     * 生成外联平台流水号和退款流水号
     * yyyyMMddHHmmss+七位自增序列
     * @return
     */
    public String getSerialNo() {
        String dateStr = DateUtils.dateToString(new Date(), "yyyyMMdd");
        Long seqId = redisCacheManager.incr( "wlpt", dateStr);
        dateStr = DateUtils.dateToString(new Date(), "yyyyMMdd");
        return  dateStr + String.format("%08d", seqId);
    }

    /**
     * 获取自增序号（表）
     *
     * @param key
     * @return
     */
    public Long getSequenceForTable(String key) {
        return redisCacheManager.incrBy( "sequence:" + key, 1L);

    }


}
