package com.yc.enum1920;

/**
 * Created by yucheng on 2018/8/30.
 * 枚举除了不能从另一个枚举继承以外，我们基本上可以将enum当做一个常规的类
 */
public enum OzWitch {
    // 注意：实例必须在方法之前定义
    WEST("Miss Gulch,aka the Wicked Witch of the West"),
    NORTH("Glinda,the Good Witch of the North"),
    EAST("east"),
    South("south");

    // 虽然实例定义在前，但真正的顺序还是构造器在前的，与普通类一样理解
    private String description;
    OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ": " + witch.description);
        }
    }
}
