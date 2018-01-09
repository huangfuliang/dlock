package com.hfl.core.lock;

import java.util.concurrent.TimeUnit;

/**
 * Created by 黄福亮 on 2018/1/4.
 *
 * 声明锁的接口
 */
public interface Lock {

    default void lock() {
        String currentThread = Thread.currentThread().getName();
        lock(currentThread, 60, TimeUnit.SECONDS);
    }

    void lock(String lockName, int time, TimeUnit timeUnit);

    void lockInterruptibly() throws InterruptedException;

    boolean tryLock();

    boolean tryLock(long time, TimeUnit unit);

    void unlock(String lockName);


}
