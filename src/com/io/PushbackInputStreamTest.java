package com.io;

import java.io.FileInputStream;
import java.io.PushbackInputStream;

/**
 * Created by weitaosheng on 2017/3/11.
 */
public class PushbackInputStreamTest {

    public static void main(String[] args) throws Exception{
        test();
//        PushbackInputStream inputStream = new PushbackInputStream(
//                                                new FileInputStream("input.txt"));
//        int data = inputStream.read();
//        System.out.println("Read before push back: " + data);
//        inputStream.unread(data);
//        data = inputStream.read();
//        System.out.println("Read after push back: " + data);
    }

    private static void test() throws Exception{
        PushbackInputStream input = new PushbackInputStream(
                                            new FileInputStream("input.txt"),10);
        byte[] bytes = new byte[7];
        int r = input.read(bytes);
        System.out.println("Read before push back: ");
        for (byte b : bytes) {
            System.out.println(b);
        }
        for (int i = 0; i < 7; i++) {
            input.unread(i);
        }
        r = input.read(bytes);
        System.out.println("Read after push back: ");
        for (byte b : bytes) {
            System.out.println(b);
        }
    }

}
