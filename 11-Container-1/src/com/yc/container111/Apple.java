package com.yc.container111;

/**
 * Created by yucheng on 2018/8/20.
 */
public class Apple {
    private static long counter;
    // 没创建一个Apple对象会增加1
    private final long id = counter++;
    public long id(){
        return id;
    }
}
