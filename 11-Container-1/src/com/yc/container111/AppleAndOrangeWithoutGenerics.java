package com.yc.container111;

import java.util.ArrayList;

/**
 * Created by yucheng on 2018/8/20.
 */
public class AppleAndOrangeWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0;i < 3;i++){
            // 没有泛型的时候，都是将对象当做Object插入的
            apples.add(new Apple());
        }
        // 因此，当你插入Orange类型的对象也不会报错
        apples.add(new Orange());
        // 但是，当我们输出对象时，需要进行强制类型转换，否则输出的就是Object类型引用
        for (int i = 0;i < apples.size();i++){
            System.out.println(apples.get(i));
            // runtime error :会报错，因为容器内有Apple类型对象和Orange对象
            // System.out.println((Apple)apples.get(i));
            // System.out.println((Orange)apples.get(i));
        }
    }
}
