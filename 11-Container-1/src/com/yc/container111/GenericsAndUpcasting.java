package com.yc.container111;

import java.util.ArrayList;

/**
 * Created by yucheng on 2018/8/20.
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        // 容器对于多态也是支持的
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        apples.add(new Gala());
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
