package com.yc.array165;

import com.yc.array161.BerylliumSphere;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yucheng on 2018/8/16.
 * 因为我们知道编译期不让我们实例化泛型数组，但是却可以创建对这种数组的引用，
 * 这为我们提供解决问题的思路：
 * 1.创建对这种数组的引用
 * 2.创建非泛型数组
 * 3.转型
 */
public class ArrayOfGenerics {
    public static void main(String[] args) {
        // 创建引用
        List<String>[] ls;
        // 创建非泛型数组
        List[] la = new List[10];
        // 转型
        ls = la;
        ls[0] = new ArrayList<String>();
        // ls[1] = new ArrayList<Integer>();// complie error

        // 问题是，数组也是协变类型，因此List<String>[]也是一个Object[],所以会出现下面的情况
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        // 上面的三步我们可以直接合并成一步
        List<BerylliumSphere>[] spheres = ( List<BerylliumSphere>[])new List[10];
        for(int i = 0;i < spheres.length;i++){
            spheres[i] = new ArrayList<BerylliumSphere>();
        }

    }
}
