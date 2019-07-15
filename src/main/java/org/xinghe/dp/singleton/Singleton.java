package org.xinghe.dp.singleton;

/**
 * 单例模式
 */
public class Singleton {

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }

}
