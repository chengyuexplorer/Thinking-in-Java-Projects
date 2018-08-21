package com.yc.array161;

/**
 * Created by yucheng on 2018/8/16.
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere" + id ;
    }
}
