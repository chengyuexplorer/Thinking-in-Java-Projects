package com.yc.annotation2020;

import com.yc.annotation2011.PasswordUtils;
import com.yc.annotation2011.UseCase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yucheng on 2018/9/6.
 */
public class UseCaseTracker {
    // 编写注解处理器
    public static void trackUseCases(List<Integer> useCases, Class<?> cl){
        // 遍历所有的方法
        for (Method m : cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null){
                // 将找到的用例输出
                System.out.println("Found Use Case :" + uc.id() +  " " + uc.description());
                // 输出之后就将其删除，剩下的就是
                useCases.remove(new Integer(uc.id()));
            }
        }
        // 将缺失的用例输出
        for (int i : useCases){
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
