package com.yc.container172.container1721;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by yucheng on 2018/8/21.
 * 重点：所有的Collection子类型都有一个接收另一个Collection对象的构造器，用
 *       所接收到的Collection对象中的元素来填充新的容器。
 *  set重载了addAll()方法
 *  boolean addAll(Collection<? extends E> c)：
 *  如果 set 中没有指定 collection 中的所有元素，则将其添加到此 set 中（可选操作）。
 */
public class CollectionDataTest {
    public static void main(String[] args) {
        // 用14个元素来填充set,总共有15个
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(),14));
        System.out.println(set);
        // output：
        // [strange, women, lying, in, ponds, distributing, swords, is, no, basis, for, a, system, of]
        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
        // output：
        // [strange, women, lying, in, ponds, distributing, swords, is, no, basis, for, a, system, of, government]
    }
}
