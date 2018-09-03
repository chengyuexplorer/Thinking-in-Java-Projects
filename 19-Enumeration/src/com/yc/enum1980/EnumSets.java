package com.yc.enum1980;

import java.util.EnumSet;
// 静态导入
import static com.yc.enum1980.AlarmPoints.*;

/**
 * Created by yucheng on 2018/8/30.
 * allOf(Class<E> elementType)
 * 创建一个包含指定元素类型的所有元素的枚举 set。
 * noneOf(Class<E> elementType)
 * 创建一个具有指定元素类型的空枚举 set。
 */
public class EnumSets {
    public static void main(String[] args) {
        // 创建一个具有指定元素类型的空枚举set
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        // 向其中添加
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        System.out.println(points);
        // 删除指定enumSet中的对象
        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1,OFFICE3));
        System.out.println(points);

    }
}
