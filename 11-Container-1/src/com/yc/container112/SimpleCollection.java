package com.yc.container112;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by yucheng on 2018/8/20.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        // List：有序、可重复
        // Set：无序、不可重复
        Collection<Integer> c = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            c.add(i);
        }
        // 所有的容器都可以使用foreach
        for (Integer i : c) {
            System.out.println(i);
        }
    }
}
