package com.yc.enum1990;

import com.yc.enum1980.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

import static com.yc.enum1980.AlarmPoints.*;

/**
 * Created by yucheng on 2018/8/30.
 */
public class EnumMaps {
    public static void main(String[] args) {
        // 创建一个具有指定键类型的空枚举映射。
        EnumMap<AlarmPoints,Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        // 以匿名内部类的方式创建映射关系
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });
        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom alert!");
            }
        });

        // 遍历EnumMap
        for (Map.Entry<AlarmPoints,Command> e: em.entrySet()){
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }

        try {
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
