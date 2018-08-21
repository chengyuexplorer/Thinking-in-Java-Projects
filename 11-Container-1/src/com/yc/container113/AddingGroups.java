package com.yc.container113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by yucheng on 2018/8/20.
 * 这一节将展示几个非常用用的关于集合的常用方法
 * Arrays.asList():接收一个数组或者一个用逗号隔开的元素列表
 * Collection.addAll():只能接收一个Collection对象作为参数
 * Collections.addAll():接收一个Collection对象数组或者一个用逗号隔开的元素列表
 */
public class AddingGroups {
    public static void main(String[] args) {
        // Arrays.asList()：
        // 接受一个数组或一个用逗号分隔的元素列表（使用可变参数），将其转换成一个List对象
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer[] moreInts = {5,6,7,8,9,10};
        // collection对象的addAll()与Collections.addAll()的区别：
        // collection.addAll()：只能接受一个集合作为参数
        // compile error:
        // collection.addAll(11,12,13);
        // collection.addAll(moreInts);
        collection.addAll(Arrays.asList(moreInts));
        // Collections.addAll()：接受一个Collection对象，以及一个数组或者一个用逗号隔开的列表，将元素添加到Collection中
        Integer[] anotherInts = {11,12,13};
        Collections.addAll(collection,anotherInts);
        Collections.addAll(collection,14,15);

        // 输出
        for (Integer i : collection) {
            System.out.println(i);
        }
    }
}
