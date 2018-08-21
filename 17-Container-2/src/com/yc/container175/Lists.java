package com.yc.container175;

import java.util.*;

/**
 * Created by yucheng on 2018/8/21.
 * 主要演示List集合的相关操作
 * 建议：可以多看看JDK帮助文档
 * output:
 * 1：[1, x, 2, 3, 4, 5]
 * 2：[1, x, 2, 3, 4, 5, x]
 * 3：[1, x, 2, 3, 4, 5, x, A, B, C, D, E]
 * 4：[1, x, 2, F, G, H, I, J, 3, 4, 5, x, A, B, C, D, E]
 * 5：w is in a ?:false
 * 6：F-J is in a ?:true
 * 7：x
 * 8：12
 * 9：12
 * 10：a is empty ? :12
 * 11：iterator():java.util.LinkedList$ListItr@3da5f0f3
 * 12：listIterator():java.util.LinkedList$ListItr@596e0123
 * 13：after remove:[1, 2, F, G, H, I, J, 3, 4, 5, x, A, C, D, E]
 * 14：after set:[1, W, F, G, H, I, J, 3, 4, 5, x, A, C, D, E]
 * 15：intersection between a and x:[F, G, J]
 * 16：a.size = [F, G, J]
 * 17：after clean = []
 * ===================================================
 * 1：hasNext() true
 * 2：hasPrevious() false
 * 3：lit.next() = 1
 * 4：lit.nextIndex() = 1
 * 5：lit.previous() = 1
 * 6：lit.previousIndex() = -1
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    // basicTest包含每个List都可以执行的操作
    public static void basicTest(List<String> a){
        // 添加元素
        a.add(1,"x");// 在指定位置添加元素
        System.out.println("1：" + a);
        a.add("x");// 在尾部添加元素
        System.out.println("2：" + a);
        // 添加集合
        a.addAll(Arrays.asList("A","B","C","D","E"));// 在尾部添加
        System.out.println("3：" + a);
        a.addAll(3,Arrays.asList("F","G","H","I","J"));
        System.out.println("4：" + a);
        // 判断是否包含元素
        b = a.contains("w");
        System.out.println("5：w is in a ?:" + b);
        b = a.containsAll(Arrays.asList("F","G","H","I","J"));
        System.out.println("6：F-J is in a ?:" + b);
        // 查询
        s = a.get(1);
        System.out.println("7：" + s);
        i = a.indexOf("A");// i表示元素A的索引
        System.out.println("8：" + i);
        i = a.lastIndexOf("A");// i表示最后一个匹配的元素的索引
        System.out.println("9：" + i);
        // 判断是否为空
        b = a.isEmpty();
        System.out.println("10：a is empty ? :" + i);
        // 获取迭代器
        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);// 并指向指定索引处
        System.out.println("11：iterator():" + it);
        System.out.println("12：listIterator():" + lit);
        // 删除元素
        a.remove(1);// 删除索引为1的元素
        a.remove("B");
        System.out.println("13：after remove:" + a);
        // 替换
        a.set(1,"W");
        System.out.println("14：after set:" + a);
        // 集合操作
        a.retainAll(Arrays.asList("F","G","J"));// 取交集
        System.out.println("15：intersection between a and x:" + a);
        // 尺寸
        i = a.size();
        System.out.println("16：a.size = " + a);
        // 清除clear
        a.clear();
        System.out.println("17：after clean = " + a);
    }
    // 使用iterator遍历元素
    public static void iterMotion(List<String> a){
        ListIterator<String> lit = a.listIterator();
        b = lit.hasNext();// 判断是否还有下一个元素
        System.out.println("1：hasNext() " + b);
        b = lit.hasPrevious();// 判断是否还有前一个元素
        System.out.println("2：hasPrevious() " + b);
        s = lit.next();
        System.out.println("3：lit.next() = " + s);
        i = lit.nextIndex();
        System.out.println("4：lit.nextIndex() = " + i);
        s = lit.previous();
        System.out.println("5：lit.previous() = " + s);
        i = lit.previousIndex();
        System.out.println("6：lit.previousIndex() = " + i);

    }

    public static void main(String[] args) {
        // basicTest操作
        basicTest(new LinkedList<String>(Arrays.asList("1","2","3","4","5")));
        System.out.println("===================================================");
        // iterMotion操作
        iterMotion(new ArrayList<String>(Arrays.asList("1","2","3","4","5")));
    }
}
