package com.yc.container172.container1722;

import com.yc.container172.container1721.Generator;

import java.util.Iterator;

/**
 * Created by yucheng on 2018/8/21.
 */
public class Letters implements Generator<Pair<Integer,String>> ,Iterable<Integer>{
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++," " + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }
            @Override
            public Integer next() {
                return number++;
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
