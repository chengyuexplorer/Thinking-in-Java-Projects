package com.yc.enum19100;

/**
 * Created by yucheng on 2018/8/30.
 */
public enum LikeClasses {
    WINKEN{
        void behavior(){
            System.out.println("Behavior1");
    }},
    BLINKEN{
        void behavior(){
            System.out.println("Behavior2");
        }
    },
    NOD{
        void behavior(){
            System.out.println("Behavior3");
        }
    };

    abstract void behavior();

}
