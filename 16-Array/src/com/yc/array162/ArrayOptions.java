package com.yc.array162;

import com.yc.array161.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/16.
 * 本例主要总结数组的各种初始化方式，以及如何对指向数组的引用赋值，使之指向另一个数组对象
 */
public class ArrayOptions {
    public static void main(String[] args) {
        // 对象数组,a,b是引用
        BerylliumSphere[] a;// 未初始化
        BerylliumSphere[] b = new BerylliumSphere[5];
        // 数组内部的引用会自动被初始化，若为对象类型则为null,若为基本数据类型则会被初始化为相应值
        System.out.println("b:" + Arrays.toString(b));
        // output:b:[null, null, null, null, null]

        BerylliumSphere[] c = new BerylliumSphere[4];
        // 利用循环一个个初始化
        for (int i = 0;i < c.length;i++){
            if (c[i] == null){
                c[i] = new BerylliumSphere();
            }
        }
        // 集体初始化
        BerylliumSphere[] d = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
        // 动态集体初始化
        a = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
        // 输出各个数组的长度
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        System.out.println("=====================================");

        // 引用的赋值
        a = b;
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);

        System.out.println("==========下面是基本数据类型的情况===========");
        int[] e;
        int[] f = new int[5];



    }


}
