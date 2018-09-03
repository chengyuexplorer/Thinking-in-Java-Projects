package com.yc.enum19102;

import com.yc.enum1950.Generator;

/**
 * Created by yucheng on 2018/9/3.
 */
public class RandomInputGenerator implements Generator<Input> {
    @Override
    public Input next() {
        return Input.randomSelection();
    }
}
