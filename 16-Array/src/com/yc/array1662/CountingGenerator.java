package com.yc.array1662;

/**
 * Created by yucheng on 2018/8/16.
 * 此类是用于生成所有基本类型的包装类型以及String的计数生成器集合
 * 通过静态内部类的方式，在类的内部为每一种类型创建相应的生成器
 */
public class CountingGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;
        @Override
        public java.lang.Boolean next() {
            value = !value;// 翻转一下
            return value;
        }
    }

    public static class Byte implements Generator<java.lang.Byte>{
        private byte value = 0;
        @Override
        public java.lang.Byte next() {
            return value++;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();


}
