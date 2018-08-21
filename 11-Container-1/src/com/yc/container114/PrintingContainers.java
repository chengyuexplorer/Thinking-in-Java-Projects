package com.yc.container114;

import java.util.*;

/**
 * Created by yucheng on 2018/8/20.
 * 我们知道对于数组的打印：必须调用Arrays.toString()方法，才能输出打印
 * 但是容器无需任何帮助，可以直接打印
 * 原因：容器已经重写了Object的toString()方法，但是数组并没有重写
 *
 * List：有序可重复
 * Set：无序，不可重复
 * Queue：一端插入，一端输出，底层实现的队列
 *
 * ArrayList与LinkedList的区别：
 * 主要是在性能上的不同：ArrayList因为底层是数组，因此查询的效率要高一些，
 *                       而LinkedList底层是链表，因而插入和删除的效率要高些；
 *                       但因为它们本质都是List，因此都是有序可重复的
 *
 * Set:无序、不可重复
 * HashSet：获取元素速度最快，但不关注顺序
 * TreeSet：有顺序：按照比较结果的升序保存对象
 * LinkedHashSet：按照被添加的顺序保存对象，同时保留了HashSet的查询速度
 *
 * Map：键值对（Key,Value）
 * HashMap：提供最快的查询速度，但没有按明显的顺序来保存元素
 * TreeMap：按照比较结果的升序存储对象
 * LinkedHashMap：按照插入的顺序保存对象，同时还保留了HashMap的查询速度
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Fuzzy");
        map.put("dog","Spot");
        return map;
    }
    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
