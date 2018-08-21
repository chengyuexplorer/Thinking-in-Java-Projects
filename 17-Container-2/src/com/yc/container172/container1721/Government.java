package com.yc.container172.container1721;

/**
 * Created by yucheng on 2018/8/21.
 * 此类作用：生成器，此处用来提供数据
 */
public class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds " +
                           "distributing swords is no basis for a system of " +
                           "government").split(" ");
    private int index;
    // 初始值为1，每调用一次next()方法，index之加1
    @Override
    public String next() {
        return foundation[index++];
    }
}
