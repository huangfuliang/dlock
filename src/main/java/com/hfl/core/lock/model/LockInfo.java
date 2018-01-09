package com.hfl.core.lock.model;

/**
 * Created by 黄福亮 on 2018/1/4.
 * 锁模型
 */
public class LockInfo {

    private String lockStrategy;
    private String lockType;
    private String lockName;
    private long waitTime;
    private long expireTime;

    /**
     * @param lockStrategy 锁的策略
     * @param lockType 锁类型
     * @param lockName 锁名称
     * @param waitTime 锁的等待时间
     * @param expireTime 锁的超时时间（防止死锁）
     */
    LockInfo(String lockStrategy, String lockType,
             String lockName, long waitTime, long expireTime) {
        this.lockStrategy = lockStrategy;
        this.lockType = lockType;
        this.lockName = lockName;
        this.waitTime = waitTime;
        this.expireTime = expireTime;
    }

    public String getLockStrategy() {
        return lockStrategy;
    }

    public void setLockStrategy(String lockStrategy) {
        this.lockStrategy = lockStrategy;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }
}

