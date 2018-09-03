package com.yc.enum1960;

/**
 * Created by yucheng on 2018/8/30.
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            System.out.println(Enums.random(Activity.class) + " ");
        }
    }
}
