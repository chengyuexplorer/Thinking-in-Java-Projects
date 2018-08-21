package com.yc.container1110;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by yucheng on 2018/8/20.
 * Map:
 * 将对象映射到其它对象的能力是解决编程问题的杀手锏
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(13);
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0;i < 10000; i++){
            // 产生0-20之间的随机数
            // 自动包装机制将随机产生的int转换成HashMap可以使用的Integer引用
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r,freq == null ? 1:freq + 1);
        }
        System.out.println(m);
    }
}
