package com.hfl.core.lock;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * Created by 黄福亮 on 2018/1/4.
 * 重入锁
 */
public class ReentrantLock implements Lock, Serializable {

    @Override
    public void lock(String lockName, int time, TimeUnit timeUnit) {

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

    }
}
