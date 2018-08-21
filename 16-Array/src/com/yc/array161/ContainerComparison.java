package com.yc.array161;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yucheng on 2018/8/16.
 * 此例将用来比较数组和泛型容器
 */
public class ContainerComparison {
    public static void main(String[] args) {
        // 创建BerylliumSphere类型数组，并指定大小为10
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        // 初始化数组
        for(int i = 0;i < 5;i++){
            spheres[i] = new BerylliumSphere();
        }
        // 打印数组
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[3]);
        System.out.println("==================================");

        // 创建容器ArrayList
        List<BerylliumSphere> list = new ArrayList<>();
        // 填充容器
        for(int i = 0;i < 5;i++){
            list.add(new BerylliumSphere());
        }
        // 打印容器
        System.out.println(list);
        System.out.println(list.get(3));

    }
}
