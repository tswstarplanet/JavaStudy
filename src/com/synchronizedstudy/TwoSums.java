package com.synchronizedstudy;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class TwoSums {
    private int sum1 = 1;
    private int sum2 = 2;

    private Integer sum1Lock = new Integer(1);
    private Integer sum2Lock = new Integer(2);

    public void addValue1(int value1) {
        synchronized (this.sum1Lock) {
            this.sum1 += value1;
        }

    }

}
