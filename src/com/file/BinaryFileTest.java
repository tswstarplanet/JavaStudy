package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;


/**
 * Encoding is transforming some words that are not English to binary sequence with one encoding pattern
 * Decoding is transforming binary sequence to some words that are not English with one encoding pattern
 */

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class BinaryFileTest {
    public static void main(String[] args) throws Exception{
        File file = new File("test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("我是中国人".getBytes());
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[100];
        fileInputStream.read(bytes);
        for (byte b : bytes) {
            System.out.println(b);
        }
        FileReader fileReader = new FileReader(file);
    }

}
