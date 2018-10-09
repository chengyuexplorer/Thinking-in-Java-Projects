package com.yc.annotation2023;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yucheng on 2018/10/9.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    /**
     * 提供注解的这个name元素，为创建数据库表提供表的名字
     * @return
     */
    public String name() default "";
}
