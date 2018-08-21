package com.yc.array163;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by yucheng on 2018/8/16.
 * 本例演示如何返回一个数组
 */
public class IceCream {
    private static Random random = new Random(13);
    static final String[] FLAVORS = {
            "Chocolate","Strawberry","Vanilla Fudge Swirl",
            "Mint chip","Mocha Almond Fudge","Rum Raisin",
            "Praline Cream","Mud Pie"
    };
    public static String[] flavorSet(int n){
        // 返回集合不能比FLAVORS[]数组大
        if (n > FLAVORS.length){
            throw new IllegalArgumentException("Set too big");
        }
        String[] results = new String[n];
        // 默认初始化都是false
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0;i < n;i++){
            int t;
            // 循环的作用在于保证我们每次的取出的t都是不同的值，即result的值不重复
            do {
                // random能保证方法每次返回的值都是随机的
                t = random.nextInt(FLAVORS.length);
            }while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;
    }

    public static void main(String[] args) {
        // 利用一个循环，多次打印数组
        for (int i = 0;i < 7;i++){
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}
