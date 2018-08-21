package com.yc.generic1520;

/**
 * Created by yucheng on 2018/8/17.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }
    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
    public static void main(String[] args) {
        // 很明显，效果更佳
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.getA();
        System.out.println(a);
    }
}
