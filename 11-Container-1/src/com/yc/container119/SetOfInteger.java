package com.yc.container119;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by yucheng on 2018/8/20.
 * Set：
 * 无序，不可重复
 * 具有和Collection完全一样的接口，List在Collection的基础上还添加了很多功能
 * HashSet：使用的是散列函数
 * TreeSet：将元素存储在红-黑树数据结构中；按照比较结果的升序存储对象
 * LinkedHashSet：因为查询速度的原因，也使用了散列，但使用了链表来维护元素的插入顺序
 *                存出顺序是元素的插入顺序
 *
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(13);
        // HashSet的重心放在查询速度上，因此忽略了顺序
        Set<Integer> intset = new HashSet<>();
        for (int i = 0;i < 1000;i++){
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
