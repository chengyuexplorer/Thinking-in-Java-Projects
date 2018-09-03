package com.yc.enum19100;

import java.util.EnumSet;
/**
 * Created by yucheng on 2018/8/30.
 */
public class CarWash {
    public enum Cycle{
        UNDERBODY{
            void action(){
                System.out.println("Spraying the underbody");
            }
        },
        WHEELWASH{
            void action(){
                System.out.println("Washing the wheels");
            }
        },
        PREWASH{
            void action(){
                System.out.println("Loosening the dirt");
            }
        },
        Basic{
            void action(){
                System.out.println("The basic wash");
            }
        },
        HOTWAX{
            void action(){
                System.out.println("Applying hot wax");
            }
        },
        RINSE{
            void action(){
                System.out.println("Rinsing");
            }
        },
        BLOWDRY{
            void action(){
                System.out.println("Blowing dry");
            }
        };

        abstract void action();
    }

    EnumSet<Cycle> cycles = EnumSet.of(Cycle.Basic,Cycle.RINSE);

    public void add(Cycle cycle){
        cycles.add(cycle);
    }

    public void washCar(){
        for (Cycle cycle : cycles) {
            cycle.action();
        }
    }
    public String toString(){
        return cycles.toString();
    }

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        System.out.println(wash);
        wash.washCar();
        // 添加的顺序无关紧要，因为在Set中的顺序是按照实例定义的顺序来的
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOTWAX);
        System.out.println(wash);
        wash.washCar();
    }
}
