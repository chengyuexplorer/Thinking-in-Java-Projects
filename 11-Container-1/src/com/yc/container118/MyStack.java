package com.yc.container118;

import java.util.LinkedList;

/**
 * Created by yucheng on 2018/8/20.
 * 栈：后进先出
 * LinkedList具有能够直接实现栈的所有功能的方法，因此可以直接将LinkedList作为栈使用
 */
public class MyStack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    // 压栈
    public void push(T v){
        storage.addFirst(v);
    }
    // 选择元素
    public T peek(){
        return storage.getFirst();
    }
    // 弹栈
    public T pop(){
        return storage.removeFirst();
    }
    // 判断是否为空
    public boolean empty(){
        return storage.isEmpty();
    }
    public String toString(){
        return storage.toString();
    }
}
