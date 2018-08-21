package com.yc.container113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yucheng on 2018/8/20.
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        // compile error：List<Snow>告诉你类型是Snow，但是asList()会理想化，它认为的类型是前一级Power
        //                因为Light和Heavy都是继承自Power,从而导致类型不匹配
        // Required:<com.yc.container113.Snow>
        // Found:  <com.yc.container113.Powder
        // List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
        // 解决方法：显示的指定参数类型
        List<Snow> snow3 = Arrays.<Snow>asList(new Light(),new Heavy());

        // 所以一般将Arrays.asList()与addAll()方法合用会是不错的选择
        List<Snow> snow4 = new ArrayList<>();
        snow4.addAll(Arrays.asList(new Light(),new Heavy()));

    }
}
