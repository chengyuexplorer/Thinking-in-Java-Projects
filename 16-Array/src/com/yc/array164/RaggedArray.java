package com.yc.array164;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by yucheng on 2018/8/16.
 * 粗糙数组：数组中构成矩阵的每个向量都可以是任意的长度
 */
public class RaggedArray {
    public static void main(String[] args) {
        Random random = new Random(13);
        // 指定数组的一维大小
        // a是整个数组的引用
        int[][][] a = new int[random.nextInt(7)][][];
        // a.length表示的是数组第1维的长度
        for (int i = 0;i < a.length;i++){
            // a[i]是后面两维的引用
            a[i] = new int[random.nextInt(5)][];
            // a[i].length表示的是数组第2维的长度
            for (int j = 0;j < a[i].length;j++){
                // a[i][j]是第三维的引用
                a[i][j] = new int[random.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
