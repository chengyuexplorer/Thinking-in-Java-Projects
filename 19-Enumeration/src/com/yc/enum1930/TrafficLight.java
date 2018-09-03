package com.yc.enum1930;

/**
 * Created by yucheng on 2018/8/30.
 * enum与switch的配合使用，堪称绝妙
 */
public class TrafficLight {
    enum Signal {GREEN,YELLOW,RED}
    // color默认颜色是RED
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "Traffic Light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight();
        for (int i = 0; i < 7; i++){
            System.out.println(tl);
            tl.change();
        }
    }
}
