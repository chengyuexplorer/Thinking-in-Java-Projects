package com.yc.enum1950;


import java.util.Random;

/**
 * Created by yucheng on 2018/8/30.
 */
public enum CartoonCharacter implements Generator<CartoonCharacter> {
    SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
    private Random random = new Random(13);
    @Override
    public CartoonCharacter next() {
        // 随机返回一个CartoonCharacter的实例
        return values()[random.nextInt(values().length)];
    }
}
