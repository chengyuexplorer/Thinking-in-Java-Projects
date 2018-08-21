package com.yc.array165;

/**
 * Created by yucheng on 2018/8/16.
 */
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        Double[] doubles = {1.1,2.2,3.3,4.4,5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        Integer[] ints3 = MethodParameter.f(ints);
        Double[] doubles3 = MethodParameter.f(doubles);
    }
}
