package com.yc.container111;

import java.util.ArrayList;

/**
 * Created by yucheng on 2018/8/20.
 */
public class AppleAndOrangeWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();
        for(int i = 0;i < 3;i++){
            // 没有泛型的时候，都是将对象当做Object插入的
            apples.add(new Apple());
        }
        // compile error:此时在编译期就会报错
        // apples.add(new Orange());
        for (int i = 0;i < apples.size();i++){
            System.out.println(apples.get(i));
        }
        // foreach
        for (Apple apple:apples) {
            System.out.println(apple);
        }
    }
}
