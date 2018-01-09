package com.hfl.config;

import org.redisson.Redisson;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * Created by 黄福亮 on 2018/1/4.
 */
public class RedisConfig {

    private static final String id = "genId_";
    private static Config config = new Config();
    private static RedissonClient redissonClient = null;

    static {
        config.useClusterServers()
                .setScanInterval(2000)
                .setMasterConnectionPoolSize(10000)
                .setSlaveConnectionPoolSize(10000)
                .addNodeAddress("20.26.25.65:6101", "20.26.25.65:6102", "20.26.25.65:6103");
        redissonClient =  Redisson.create(config);
        /** 清空自增的ID */
        RAtomicLong atomicLong = redissonClient.getAtomicLong(id);
        atomicLong.set(1);
        System.out.println("redis config sucess!");
    }

    public static RedissonClient getRedissonClient() {
        return redissonClient;
    }

    public static long nextId() {
        RAtomicLong atomicLong = getRedissonClient().getAtomicLong(id);
        atomicLong.incrementAndGet();
        return atomicLong.get();
    }

    public static void nextId1() {
        System.out.println("---------------------");
    }

}
