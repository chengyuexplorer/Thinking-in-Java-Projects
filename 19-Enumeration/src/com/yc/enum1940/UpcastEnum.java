package com.yc.enum1940;

/**
 * Created by yucheng on 2018/8/30.
 */
public class UpcastEnum {
    public static void main(String[] args) {
        Explore[] vals = Explore.values();
        // upcast
        Enum e = Explore.HERE;
        // compile error
        // e.values();
        for(Enum en: e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
