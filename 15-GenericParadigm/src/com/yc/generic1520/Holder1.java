package com.yc.generic1520;

/**
 * Created by yucheng on 2018/8/17.
 * 能够持有一个Automobile对象，但是复用性很差，只能
 * 持有一种类型的
 */
public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) {
        this.a = a;
    }
    public Automobile getA() {
        return a;
    }

}
