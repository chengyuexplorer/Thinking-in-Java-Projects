package com.yc.array164;

import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/16.
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        // Arrays.deepToString()方法实际就是Arrays.ToString()的一个加强
        // 用来将数组格式化输出
        System.out.println(Arrays.deepToString(a));
    }
}
