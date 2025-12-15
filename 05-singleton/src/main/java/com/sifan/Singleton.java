package com.sifan;

import java.io.Serializable;

/**
 * 单例模式 - 双重检查锁定实现
 * 添加序列化安全处理，防止反序列化创建多个实例
 *
 * @author 思凡
 */
public class Singleton implements Serializable {
    private static volatile Singleton instance;

    private Singleton() {
        // 防止反射攻击
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * 防止反序列化创建新实例
     */
    protected Object readResolve() {
        return getInstance();
    }
}
