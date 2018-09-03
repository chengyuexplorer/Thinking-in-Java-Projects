package com.yc.enum1950;

/**
 * Created by yucheng on 2018/8/30.
 */
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.print(rg.next() + ", ");
    }

    public static void main(String[] args) {
        // 选择一个实例
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 7; i++){
            printNext(cc);
        }
    }
}
