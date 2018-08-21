package com.yc.array1675;

import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/16.
 */
public class BinarySerachTest {
    public static void main(String[] args) {
        int[] a = {1,2,5,4,3,5,6,7,8};
        System.out.println("==========排序前============");
        System.out.println(Arrays.toString(a));
        // 排序
        System.out.println("==========排序后============");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 搜索
        int location = Arrays.binarySearch(a,5);
        System.out.println(location);
    }
}
