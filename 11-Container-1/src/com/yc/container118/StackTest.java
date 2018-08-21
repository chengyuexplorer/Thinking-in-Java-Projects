package com.yc.container118;

import java.util.Stack;

/**
 * Created by yucheng on 2018/8/20.
 */
public class StackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        for (String s:"My dog has fleas".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
