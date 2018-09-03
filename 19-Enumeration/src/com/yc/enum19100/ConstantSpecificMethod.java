package com.yc.enum19100;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by yucheng on 2018/8/30.
 * 给每个枚举实例编写方法，从而为每个enum实例赋予各自不同的行为
 */
public enum ConstantSpecificMethod {
    DATE_TIME{
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    // 定义抽象方法，然后让枚举实例去实现
    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }
}
