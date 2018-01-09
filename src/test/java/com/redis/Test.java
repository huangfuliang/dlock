package com.redis;

import com.hfl.config.RedisConfig;
import com.hfl.core.lock.DistributedRedisLock;
import com.hfl.core.lock.Lock;
import org.redisson.api.RedissonClient;

/**
 * Created by 黄福亮 on 2018/1/9.
 */
public class Test {

//    @org.junit.Test
//         public void redisSessionTest() {
//        new Thread(() -> {
//            System.out.println("--");
//            RedisConfig.nextId1();
//        }).start(); ;
//    }


    public static void main(String[] args) {
        Lock lock = new DistributedRedisLock();
        lock.lock();
    }






}
