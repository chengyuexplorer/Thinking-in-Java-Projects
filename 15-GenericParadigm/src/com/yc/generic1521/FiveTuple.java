package com.yc.generic1521;

/**
 * Created by yucheng on 2018/8/17.
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E e;
    public FiveTuple(A a, B b, C c, D d,E e) {
        super(a, b, c, d);
        this.e = e;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "fourth=" + fourth +
                ", e=" + e +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
