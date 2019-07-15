package org.xinghe.dp.singleton;

/**
 * 单例模式
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }
}
