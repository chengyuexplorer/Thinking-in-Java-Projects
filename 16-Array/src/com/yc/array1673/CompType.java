package com.yc.array1673;

import com.yc.array1662.Generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


/**
 * Created by yucheng on 2018/8/16.
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    public CompType(int n1, int n2) {
        this.i = n1;
        this.j = n2;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++%3 ==0){
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType o) {
        if (i < o.i){
            return -1;
        }else if(i == o.i){
            return 0;
        }else{
            return 0;
        }
    }

    private static Random r = new Random(13);
    public static Generator<CompType> generator(){
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100),r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.fill(a,generator().next());//填充数组
        System.out.println("before sort");
        System.out.println(Arrays.toString(a));
        System.out.println("after sort");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("======================");

        CompType[] cts = {new CompType(1,2),new CompType(1,3),new CompType(2,4),
                new CompType(3,2),new CompType(2,3)};
        System.out.println(Arrays.toString(cts));
        Arrays.sort(cts);
        System.out.println(Arrays.toString(cts));

        System.out.println("===========Collections.reverseOrder()==========");
        Arrays.sort(cts, Collections.<CompType>reverseOrder());
        System.out.println(Arrays.toString(cts));



    }
}
