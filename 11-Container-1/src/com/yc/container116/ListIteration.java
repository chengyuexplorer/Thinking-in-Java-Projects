package com.yc.container116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by yucheng on 2018/8/20.
 * ListIterator:是一个更强大的Iterator，它可以双向移动，但是只能用于各种List的访问
 */
public class ListIteration {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList(
                "Rat","Manx","Cymric","Pug","Cymric","Pug","Manx"));
        ListIterator it = pets.listIterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println("==================================");
        while (it.hasPrevious()){
            System.out.print(it.previous().toString() + " ");
        }
        System.out.println();
        System.out.println("==============================");
        // 将迭代器一开始就指向索引为3的元素处
        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            // 用A替换它访问过的最后一个元素
            it.set("A");
        }
        System.out.println(pets);
    }
}
