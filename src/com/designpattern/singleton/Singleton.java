package com.designpattern.singleton;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public void test() {
        System.out.println("singleton");
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
