package com.yc.array1671;

import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/16.
 * 利用System.arraycopy()方法执行数组的复制
 */
public class CopyingArrays {
    public static void main(String[] args) {
        // 创建数组
        int[] i = new int[7];
        int[] j = new int[10];
        // 填充数组
        Arrays.fill(i,47);
        Arrays.fill(j,99);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));
        System.out.println("========================");
        // 开始复制
        System.arraycopy(i,0,j,0,4);
        System.out.println(Arrays.toString(j));


    }
}
