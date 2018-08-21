package com.yc.container119;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by yucheng on 2018/8/20.
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(13);
        // TreeSet会按照比较结果的升序排列结果
        SortedSet<Integer> intset = new TreeSet<>();
        for(int i = 0;i < 1000;i++){
            intset.add(random.nextInt(13));
        }
        System.out.println(intset);
    }
}
