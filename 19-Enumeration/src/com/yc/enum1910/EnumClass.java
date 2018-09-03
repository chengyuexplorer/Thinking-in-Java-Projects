package com.yc.enum1910;

import sun.security.provider.SHA;

/**
 * Created by yucheng on 2018/8/30.
 */
public class EnumClass {
    enum Shrubbery {
        GROUND,CRAWLING,HANGING
    }
    public static void main(String[] args) {
        for (Shrubbery s:Shrubbery.values()) {
            System.out.println(s + " ordinal: " + s.ordinal());// 定义的顺序
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
            System.out.println(s.equals(Shrubbery.CRAWLING));
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());

            // 根据一个字符串创建一个枚举对象
            for (String str:"HANGING CRAWLING GROUND".split(" ")) {
                Shrubbery shrub = Enum.valueOf(Shrubbery.class, str);
                System.out.println(shrub);
            }
        }
    }
}
