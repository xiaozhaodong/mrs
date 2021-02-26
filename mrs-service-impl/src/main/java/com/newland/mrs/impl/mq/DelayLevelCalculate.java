package com.newland.mrs.impl.mq;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-rocket
 * @className：DelayLevelCalculate
 * @date 2020/1/7 3:49 下午
 * @return 1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h
 */
public class DelayLevelCalculate {

    private static final List<Integer> DEFAULT_LEVEL;

    static {
        DEFAULT_LEVEL = new ArrayList<Integer>();
        DEFAULT_LEVEL.add(1);
        DEFAULT_LEVEL.add(5);
        DEFAULT_LEVEL.add(10);
        DEFAULT_LEVEL.add(30);
        DEFAULT_LEVEL.add(60);
        DEFAULT_LEVEL.add(120);
        DEFAULT_LEVEL.add(180);
        DEFAULT_LEVEL.add(240);
        DEFAULT_LEVEL.add(300);
        DEFAULT_LEVEL.add(360);
        DEFAULT_LEVEL.add(420);
        DEFAULT_LEVEL.add(480);
        DEFAULT_LEVEL.add(540);
        DEFAULT_LEVEL.add(600);
        DEFAULT_LEVEL.add(1200);
        DEFAULT_LEVEL.add(1800);
        DEFAULT_LEVEL.add(3600);
        DEFAULT_LEVEL.add(7200);
    }

    public static Integer calculateDefault(long second) {
        Integer level = null;
        for (int i = DEFAULT_LEVEL.size() - 1; i >= 0; i--) {
            int l = (int) second / DEFAULT_LEVEL.get(i);
            if (l > 0 && level == null) {
                level = i;
            }
            if (level == null) {
                continue;
            }
            if (level < i) {
                break;
            }
        }
        return level + 1;
    }

    public static int calculateNum(long second) {
        for (int i = DEFAULT_LEVEL.size() - 1; i >= 0; i--) {
            int l = (int) second / DEFAULT_LEVEL.get(i);
            if (l != 0) {
                return l;
            }
        }
        return 0;
    }

    public static long get(Integer index) {
        return DEFAULT_LEVEL.get(index);
    }

    public static boolean hitDefaultDelayLevel(long seconds) {
        return DEFAULT_LEVEL.contains((int) seconds);
    }

    public static void main(String[] args) {

        Date startSendTime = new Date();

        long seconds = Duration.between(Instant.now(), startSendTime.toInstant()).getSeconds();

        System.out.println(seconds);
        System.out.println(calculateDefault(TimeUnit.SECONDS.toSeconds(5)));
        System.out.println(calculateNum(2));
    }

}
