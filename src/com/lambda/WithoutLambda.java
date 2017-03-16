package com.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by weitaosheng on 2017/2/19.
 */

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class WithoutLambda {

    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());
        for (String s:
             friends) {
            System.out.println(s);
        }
    }

}
