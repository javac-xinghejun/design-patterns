package org.xinghe.dp.singleton;

/**
 * 单例模式
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }

}
