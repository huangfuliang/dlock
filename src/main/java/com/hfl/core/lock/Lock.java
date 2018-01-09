package com.hfl.core.lock;

import java.util.concurrent.TimeUnit;

/**
 * Created by 黄福亮 on 2018/1/4.
 *
 * 声明锁的接口
 */
public interface Lock {

    default void lock() {
        lock("gload", 60, TimeUnit.SECONDS);
    }

    default void lock(String lockName) {
        lock(lockName, 60, TimeUnit.SECONDS);
    }

    void lock(String lockName, int time, TimeUnit timeUnit);

    void lockInterruptibly() throws InterruptedException;

    boolean tryLock();

    boolean tryLock(long time, TimeUnit unit);

    default void unlock() {
        unlock("gload");
    }

    void unlock(String lockName);


}
