package com.synchronizedstudy;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class TestRunnable1 implements Runnable {

    private TwoSums twoSums;

    public TestRunnable1(TwoSums twoSums) {
        this.twoSums = twoSums;
    }

    @Override
    public void run() {
        twoSums.addValue1(1);
    }
}
