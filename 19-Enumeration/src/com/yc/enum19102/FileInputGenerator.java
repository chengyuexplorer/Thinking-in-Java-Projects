package com.yc.enum19102;

import com.yc.enum1950.Generator;

import java.util.Iterator;

/**
 * Created by yucheng on 2018/9/3.
 */
public class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;

    public FileInputGenerator(String filename) {
        input = null;
    }

    @Override
    public Input next() {
        if (!input.hasNext()){
            return null;
        }
        return Enum.valueOf(Input.class,input.next().trim());
    }
}
