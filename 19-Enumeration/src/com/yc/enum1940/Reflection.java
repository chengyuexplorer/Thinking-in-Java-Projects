package com.yc.enum1940;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by yucheng on 2018/8/30.
 *
 */
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("---------------Analyzing " + enumClass + " ---------------");
        System.out.println("Interfaces:打印接口");
        for(Type t: enumClass.getInterfaces()){
            System.out.println(t);
        }
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<>();
        for(Method m: enumClass.getMethods()){
            methods.add(m.getName());
        }
        // 打印所有方法
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("============================");
        System.out.println("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        System.out.print("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);

/*
        output:
        ---------------Analyzing class com.yc.enum1940.Explore ---------------
                Interfaces:打印接口
        Base: class java.lang.Enum
        Methods:
        [compareTo, equals, getClass, getDeclaringClass, hashCode, name,
                notify, notifyAll, ordinal, toString, valueOf, values, wait]
        ---------------Analyzing class java.lang.Enum ---------------
                Interfaces:打印接口
        interface java.lang.Comparable
        interface java.io.Serializable
        Base: class java.lang.Object
        Methods:
        [compareTo, equals, getClass, getDeclaringClass, hashCode, name, notify,
                notifyAll, ordinal, toString, valueOf, wait]
        ============================
        Explore.containsAll(Enum)? true
        Explore.removeAll(Enum): [values]
*/

    }
}
