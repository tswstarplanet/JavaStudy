package com.jvm;

/**
 * Created by weitaosheng on 2017/3/13.
 */
public class LoadTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = HelloWorld.class.getClassLoader();
        System.out.println(loader);
        Class.forName("com.jvm.Test2", true, loader);
//        loader.loadClass("com.jvm.Test2");
    }

}
