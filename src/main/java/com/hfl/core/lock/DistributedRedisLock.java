package com.hfl.core.lock;

import com.hfl.config.RedisConfig;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

/**
 * Created by 黄福亮 on 2018/1/9.
 * 分布式锁
 */
public class DistributedRedisLock implements Lock{
    private static RedissonClient redissonClient = RedisConfig.getRedissonClient();
    private static final String LOCK_TITLE = "dLock_";


    @Override
    public void lock(String lockName, int time, TimeUnit timeUnit) {
        String key = LOCK_TITLE + lockName;
        RLock rLock = redissonClient.getLock(key);
        rLock.lock(2, TimeUnit.MINUTES);
        System.out.println("====lock====" + Thread.currentThread().getName());
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) {
        return false;
    }

    @Override
    public void unlock(String lockName) {
        String key = LOCK_TITLE + lockName;
        RLock rLock = redissonClient.getLock(key);
        rLock.unlock();
        System.out.println("====unlock====" + Thread.currentThread().getName());
    }


}
