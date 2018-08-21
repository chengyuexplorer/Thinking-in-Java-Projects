package com.yc.container1111;

import java.util.*;

/**
 * Created by yucheng on 2018/8/20.
 *Collections.reverseOrder()：反自然排序
 * 空格优先级>字母
 * 大写字母>小写字母
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(13);
        for (int i = 0; i < 10; i++){
            priorityQueue.offer(random.nextInt(i + 10));
        }
        // 输出的同时会删除相应元素
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,2);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);

        // 用指定容量，指定比较器创建PriorityQueue对象
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.<Integer>reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);



    }
}
