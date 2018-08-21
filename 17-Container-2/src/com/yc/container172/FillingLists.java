package com.yc.container172;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yucheng on 2018/8/21.
 * 填充容器：
 * static <T> List<T> nCopies(int n, T o) ：返回由指定对象的 n 个副本组成的不可变列表。
 * static <T> void fill(List<? super T> list, T obj) ：使用指定元素替换指定列表中的所有元素。
 */
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4,new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("world!"));
        System.out.println(list);
    }
}
