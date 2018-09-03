package com.yc.enum1970;

/**
 * Created by yucheng on 2018/8/30.
 */
public class TypeOfFood {
    public static void main(String[] args) {
        // upcast
        Food food = Food.Appetizer.SALAD;
        food = Food.MainCourse.LASAGNE;
        food = Food.Dessert.GELATO;
        food = Food.Coffee.CAPPUCCINO;
    }
}
