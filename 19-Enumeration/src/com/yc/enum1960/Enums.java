package com.yc.enum1960;

import java.util.Random;

/**
 * Created by yucheng on 2018/8/30.
 */
public class Enums {
    private static Random rand = new Random(13);
    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }

    // 重载random()方法
    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
