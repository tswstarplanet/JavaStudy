package com.synchronizedstudy;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        TwoSums twoSums = new TwoSums();
        TestRunnable1 testRunnable1 = new TestRunnable1(twoSums);
        TestRunnable2 testRunnable2 = new TestRunnable2(twoSums);
        new Thread(testRunnable1).start();
        new Thread(testRunnable2).start();
    }

}
