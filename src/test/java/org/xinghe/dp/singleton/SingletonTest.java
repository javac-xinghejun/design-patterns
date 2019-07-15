package org.xinghe.dp.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void getInstance() {
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
        new Thread(()-> System.out.println(Singleton.getInstance().toString())).start();
    }
}