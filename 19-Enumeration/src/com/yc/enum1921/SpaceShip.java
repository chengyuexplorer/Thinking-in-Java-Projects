package com.yc.enum1921;

/**
 * Created by yucheng on 2018/8/30.
 */
public enum SpaceShip {
    SCOUT,CARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;

    // 重写toString()方法
    public String toString(){
        String id = name();
        // 从第二个字母开始，将其变成小写
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip s:values()) {
            System.out.println(s);
        }
    }
}
