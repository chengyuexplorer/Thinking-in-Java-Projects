package com.yc;

/**
 * Created by yucheng on 2018/8/24.
 * String特点：
 * String s1 = "china";与String s1 = new String("china");的区别：
 * 1.String s1 = "china";只会在方法区的字符串常量池中创建对象，在堆中并不会创建对象
 * 2.String s1 = new String("china");不仅会在方法区的字符串常量池中创建对象也会在堆内存中创建对象
 * 3.只要new一次，绝对会在堆内存创建新的对象，即使你的内容相同，但是在字符串常量池中一种内容却永远只有
 *   一个
 *
 * hashCode:
 * String很特殊，重写从父类继承过来的hashCode方法，使得两个
 * 如果字符串里面的内容相等，那么hashCode也相等。
 *
 * 原始的hashCode:
 * identityHashCode方法用于获取原始的hashCode
 * 如果原始的hashCode不同，表明确实是不同的对象
 */
public class StringTest {
    public static void main(String[] args) {
        //s1 和 s2 其实是同一个对象。对象的引用存放在栈中，对象存放在方法区的字符串常量池
        String s1 = "china";
        String s2 = "china";

        //凡是用new关键创建的对象，都是在堆内存中分配空间。
        String s3 = new String("china");
        //凡是new出来的对象，绝对是不同的两个对象。
        String s4 = new String("china");

        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s3 == s4);  // false
        System.out.println(s3.equals(s4));// true

        System.out.println("============================");
        // String很特殊，重写从父类继承过来的hashCode方法，使得两个
        // 如果字符串里面的内容相等，那么hashCode也相等。
        // hashCode相同，因为hashCode只与内容有关
        System.out.println(s1.hashCode());  //hashCode为94631255
        System.out.println(s2.hashCode());  //hashCode为94631255
        System.out.println(s3.hashCode());  //hashCode为94631255
        System.out.println(s4.hashCode());  //hashCode为94631255
        System.out.println("=============================");

        // 原始的hashCode
        System.out.println(System.identityHashCode(s1));//identityHashCode为1571470755
        System.out.println(System.identityHashCode(s2));//identityHashCode为1571470755
        System.out.println(System.identityHashCode(s3));//identityHashCode为1955088479
        System.out.println(System.identityHashCode(s4));//identityHashCode为524783806
    }
}
