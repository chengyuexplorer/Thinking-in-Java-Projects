package com.yc.array1661;

import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/16.
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        int[] a = new int[size];

        // fill()方法
        Arrays.fill(a,11);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,1,3,22);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,2,5,33);
        System.out.println(Arrays.toString(a));
    }
}
