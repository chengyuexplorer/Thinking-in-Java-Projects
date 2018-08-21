package com.yc.generic1521;

/**
 * Created by yucheng on 2018/8/13.
 * 可以通过继承的方式来实现长度更长的元组。
 * 增长类型是很简单的事情。
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A first, B second,C third) {
        super(first, second);
        this.third = third;
    }
    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }
}
