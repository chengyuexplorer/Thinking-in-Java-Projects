package com.yc.container117;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by yucheng on 2018/8/20.
 * LinkedList：
 * 也像ArrayList一样实现了List接口，但是底层是双向链表
 * 特点：长于插入和删除、随机查询的效率较低
 * 方法：
 * getFirst()：返回列表的第一个元素，并不移除它，如果List为空，则抛出NoSuchElementException
 * element()：返回列表的第一个元素，并不移除它，如果List为空，则抛出NoSuchElementException
 * peek()：返回列表的第一个元素，并不移除它，如果List为空，则返回null
 *
 * remove()：移除并返回列表第一个元素，如果List为空，则抛出NoSuchElementException
 * removeFirst()：移除并返回列表第一个元素，如果List为空，则抛出NoSuchElementException
 * removeLast()：移除并返回列表最后一个元素，如果List为空，则抛出NoSuchElementException
 * poll()：移除并返回列表第一个元素，如果List为空，则返回null
 *
 * addFirst()：将元素插入列表头部
 * add()：将元素插入列表尾部
 * addLast()：将元素插入列表尾部
 * offer()：也添加到底部
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> pets = new LinkedList<>(Arrays.asList("A","B","C","D","E","F"));
        System.out.println(pets);

        System.out.println("pets.getFirst()：" + pets.getFirst());
        System.out.println("pets.element()：" + pets.element());
        System.out.println("pets.peek()：" + pets.peek());

        System.out.println("pets.remove()：" + pets.remove());
        System.out.println("pets.removeFirst()：" + pets.removeFirst());
        System.out.println("pets.removeLast()：" + pets.removeLast());
        System.out.println("pets.poll()：" + pets.poll());
        System.out.println(pets);

        pets.addFirst("G");
        System.out.println("after addFirst()" + pets);
        pets.offer("H");
        System.out.println("after offer()" + pets);
        pets.add("I");
        System.out.println("after add()" + pets);
        pets.addLast("J");
        System.out.println("after addLast()" + pets);



    }
}
