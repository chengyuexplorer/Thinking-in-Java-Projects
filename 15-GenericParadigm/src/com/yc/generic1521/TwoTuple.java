package com.yc.generic1521;

/**
 * Created by yucheng on 2018/8/13.
 * 元组：它是将一组对象直接打包存储于其中的一个单一对象。这个容器对象允许
 *       读取其中的元素，但是不允许向其中存放新的对象。
 */
public class TwoTuple<A,B> {
    // 虽然客户端可以访问first和second，但是final却使得不能对其进行任何修改
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
