package com.yc.container1111;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by yucheng on 2018/8/20.
 * Queue：先进先出
 * 1.队列常被当作一种可靠的将对象从程序的某个区域传输到另一个区域的途径
 * 2.队列在并发编程中特别重要。
 * LinkedList提供了方法支持队列的行为，并且它实现了Queue接口，因此LinkedList可以作为Queue的一种实现
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek() != null){
            System.out.println(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(13);
        for (int i = 0;i < 10; i++){
            queue.offer(random.nextInt(i + 10));
        }
        System.out.println(queue);

        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()){
            qc.offer(c);
        }
        System.out.println(qc);
    }
}
