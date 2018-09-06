package com.yc.annotation2011;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yucheng on 2018/9/6.
 */
@Target(ElementType.METHOD)// 指明注解的应用范围
@Retention(RetentionPolicy.RUNTIME)// 指明注解的作用级别
public @interface UseCase {
    // 元素
    public int id();
    public String description() default "no description";
}
