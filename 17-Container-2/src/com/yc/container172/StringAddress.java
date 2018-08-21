package com.yc.container172;

/**
 * Created by yucheng on 2018/8/21.
 */
public class StringAddress {
    private String s;
    public StringAddress(String s) {
        this.s = s;
    }
    @Override
    public String toString() {
        // super.toString()打印的只是地址
        return super.toString() + " " + s;
    }
}
