package com.designpattern.singleton;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.test();
    }
}
