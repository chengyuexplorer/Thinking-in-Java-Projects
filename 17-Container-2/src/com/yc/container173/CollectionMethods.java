package com.yc.container173;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by yucheng on 2018/8/21.
 * 说明：
 * 此类是对Collection的功能方法的一个总结（不包括从Object继承而来的方法）
 * 因为Set、List、都是继承自Collection，因此二者也包含这些方法。
 * 需注意：List除了这些方法以外，自己还添加了许多其他的方法
 *
 * 方法列表：
 * 方法名                                  方法描述
 * =================================================================================================================
 * boolean add(E e)                                如果 set 中尚未存在指定的元素，则添加此元素（可选操作）。
 * boolean addAll(Collection<? extends E> c)       如果 set 中没有指定 collection 中的所有元素，则将其添加到此 set 中（可选操作），并集操作。
 * void clear()                                    移除此 set 中的所有元素（可选操作）。
 * boolean contains(Object o)                      如果 set 包含指定的元素，则返回 true。
 * boolean containsAll(Collection<?> c)            如果此 set 包含指定 collection 的所有元素，则返回 true。
 * boolean equals(Object o)                        比较指定对象与此 set 的相等性。
 * int hashCode()                                  返回 set 的哈希码值。
 * boolean isEmpty()                               如果 set 不包含元素，则返回 true。
 * Iterator<E> iterator()                          返回在此 set 中的元素上进行迭代的迭代器。
 * boolean remove(Object o)                        如果 set 中存在指定的元素，则将其移除（可选操作）。
 * boolean removeAll(Collection<?> c)              移除 set 中那些包含在指定 collection 中的元素（可选操作）。
 * boolean retainAll(Collection<?> c)              仅保留 set 中那些包含在指定 collection 中的元素（可选操作）。
 * int size()                                      返回 set 中的元素数（其容量）。
 * Object[] toArray()                              返回一个包含 set 中所有元素的数组。
 * <T> T[] toArray(T[] a)                          返回一个包含此 set 中所有元素的数组；返回数组的运行时类型是指定数组的类型。

 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("CHINA");
        c.addAll(Arrays.asList("RUSSIA","USA","UK","JAPAN"));
        System.out.println("1:" + c);
        // 利用集合来创建数组
        Object[] array = c.toArray();
        // 可见JDK帮助文档:new String[0]的作用仅仅在于告知类型
        String[] strArray = c.toArray(new String[0]);
        System.out.println("2:" + Arrays.toString(array));
        System.out.println("3:" + Arrays.toString(strArray));


    }
}
