package com.yc.container174;

import java.util.*;

/**
 * Created by yucheng on 2018/8/21.
 * 可选操作：
 * 从设计角度说，如果一个接口的方法设计为optional，表是这个方法不是为所有实现而设定的，
 * 而只是为某一类的实现而设定的。
 * 举例：
 * Arrays.asList()会生成一个List,它基于一个固定大小的数组，所以它只支持那些不会改变数组大小的操作。
 * 所以对它来讲，任何会引起对底层数据结构的尺寸进行修改的方法都会产生一个UnsupportedException异常，
 * 表示这是一个不获支持的操作。
 * 最常见的为获支持的操作，都来源于背后由固定尺寸的数据结构支持的容器。
 *
 * output:
 * haha
 * ============Arrays.asList()==================
 * retainAll: java.lang.UnsupportedOperationException
 * removeAll: java.lang.UnsupportedOperationException
 * clear: java.lang.UnsupportedOperationException
 * add: java.lang.UnsupportedOperationException
 * addAll: java.lang.UnsupportedOperationException
 * remove: java.lang.UnsupportedOperationException
 * ============comList==================
 * ============unmodifiableList==================
 * retainAll: java.lang.UnsupportedOperationException
 * removeAll: java.lang.UnsupportedOperationException
 * clear: java.lang.UnsupportedOperationException
 * add: java.lang.UnsupportedOperationException
 * addAll: java.lang.UnsupportedOperationException
 * remove: java.lang.UnsupportedOperationException
 * set: java.lang.UnsupportedOperationException
 */
public class Unsupported {
    static void test(String msg, List<String> list){
        System.out.println("============" + msg + "==================");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        // copy the subList
        Collection<String> c2 = new ArrayList<>(subList);

        // 下面的操作都会对尺寸进行改变
        try {
            c.retainAll(c2);// 求交集
        } catch (Exception e) {
            System.out.println("retainAll: " + e);
        }
        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll: " + e);
        }
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear: " + e);
        }
        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add: " + e);
        }
        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll: " + e);
        }
        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove: " + e);
        }
        // set()不会改变集合的尺寸
        try {
            list.set(0,"X");
        } catch (Exception e) {
            System.out.println("set: " + e);
        }

    }
    public static void main(String[] args) {
        // 这样生成的List，它基于一个固定大小的数组，仅仅支持那些不会改变数组大小的操作
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Arrays.asList()",list);
        // 但是我们可以将其作为构造器的参数传递给其他的集合，那这样得到的就是一个正常的集合
        List<String> comList = new ArrayList<>(list);
        test("comList",comList);
        // 调用Collections的静态方法，返回列表的不可修改的视图
        // 注意：使之列表中所有的内容都不可修改，而Arrays.asList()是可以修改内容的
        test("unmodifiableList", Collections.unmodifiableList(list));

    }
}
