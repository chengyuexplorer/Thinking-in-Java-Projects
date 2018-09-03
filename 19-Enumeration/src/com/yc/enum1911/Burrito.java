package com.yc.enum1911;
import com.yc.SpicinessEnum;

import static com.yc.SpicinessEnum.*;

/**
 * Created by yucheng on 2018/8/30.
 *
 * 静态导入：
 * 1.格式：import static com......className.*;
 * 2.传统的import格式：import com......className;
 */
public class Burrito {
    SpicinessEnum degree;
    public Burrito(SpicinessEnum degree) {
        this.degree = degree;
    }
    @Override
    public String toString() {
        return "Burrito{" +
                "degree=" + degree +
                '}';
    }
    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
    }
}
