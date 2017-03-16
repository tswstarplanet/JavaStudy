package com.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by weitaosheng on 2017/3/12.
 */
public class ArrayListTest {

    LinkedList

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        Field[] fields = ArrayList.class.getFields();
        for (Field field : fields) {
            if (field.getName().equals("DEFAULTCAPACITY_EMPTY_ELEMENTDATA")) {
                System.out.println("here");
            }
        }
//        System.out.println(strings.get(-6));
    }

}
