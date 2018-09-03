package com.yc.enum19102;
import java.util.EnumMap;

import static com.yc.enum19102.Input.*;

/**
 * Created by yucheng on 2018/9/3.
 */
public enum Category {
    MONEY(NICKEL,DIME,QUARTER,DOLLAR),
    ITEM_SELECTION(TOOTHPASTE,CHIPS,SODA,SOAP),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);
    // 创建一个静态的enumMap
    private static EnumMap<Input,Category> categories = new EnumMap<Input, Category>(Input.class);
    // 静态语句块
    static{
        for (Category c:Category.class.getEnumConstants()){
            for (Input type: c.values){
                categories.put(type,c);
            }
        }
    }
    public static Category categorize(Input input){
        return categories.get(input);
    }
    private Input[] values;
    // 构造器
    Category(Input... types) {
         values = types;
    }
}
