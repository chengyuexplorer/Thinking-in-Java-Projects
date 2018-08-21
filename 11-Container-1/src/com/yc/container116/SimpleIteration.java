package com.yc.container116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yucheng on 2018/8/20.
 * 迭代器：
 * 迭代器是一个对象，它的工作是遍历并选择序列中的对象，而客户端程序员不必知道或关心该序列的底层结构
 * 作用：
 * 1.使用方法iterator()要求容器返回一个Iterator。Iterator将准备好返回序列的第一个元素
 * 2.使用next()获得序列中的下一个元素
 * 3.使用hasNext()检查序列中是否还有元素
 * 4.使用remove()将迭代器新进返回的元素删除
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList(
                "Rat","Manx","Cymric","Pug","Cymric","Pug","Manx"));
        // 获取集合的迭代器
        Iterator<String> it = pets.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.print(str + "\n");
        }
        System.out.println("============================");
        // 也可以直接用foreach
        for (String pet : pets) {
            System.out.print(pet + " ");
        }
        // 移除由next()产生的最后一个元素
        // 注意：此处Iterator需要重新获取一遍，因为前面的Iterator已经应用，
        //       如果此处还用的话，是在前面的基础上进行
        it = pets.iterator();
        for (int i = 0;i < 7;i++){
            it.next();
            it.remove();
        }
        System.out.println("============================");
        System.out.println(pets);

    }
}
