package com.yc.container116;

import java.util.*;

/**
 * Created by yucheng on 2018/8/20.
 * Iterator的真正威力：
 * 能够将遍历序列的操作与序列底层的结构分离，所以我们通常说：迭代器统一了对容器的访问方式
 * 缺点：只能向前移动
 */
public class CrossContainerIteration {
    public static void display(Iterator<String> it){
        while (it.hasNext()){
            String str = it.next();
            System.out.print(str + " ");
        }
    }
    public static void main(String[] args) {
        // 忽略了集合的类型
        ArrayList<String> pets = new ArrayList<>(Arrays.asList("A","B","C"));
        LinkedList<String> petsLL = new LinkedList<>(pets);
        HashSet<String> petsHS = new HashSet<>(pets);
        TreeSet<String> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
