package com.newland.mrs.impl.config.seq;

import java.util.UUID;

/**
 * SeqTest
 *
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-28 11:03
 **/
public class SeqTest {

    public static void main(String[] args) {
        IdWorker idWorker = new IdWorker(1, 1);
        System.out.println(idWorker.nextId());
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
