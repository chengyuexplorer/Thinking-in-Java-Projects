package com.yc.array1672;

import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/16.
 */
public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1,47);
        Arrays.fill(a2,47);
        System.out.println(Arrays.equals(a1,a2));// true
        a2[4] = 11;
        System.out.println(Arrays.equals(a1,a2));// false

        String[] s1 = new String[4];
        // 数组对象里面存储的四个引用，指向的是同一个对象
        Arrays.fill(s1,"Hi");
        // 此时数组对象内四个引用分别指向不同的对象，尽管他们的值是一样的
        String[] s2 = {new String("Hi"),new String("Hi"),
                new String("Hi"),new String("Hi")};
        // 但是注意的是：数组相等是基于内容的，因而结果是true
        System.out.println(Arrays.equals(s1,s2));// true
    }
}
