package com.yc.container172.container1722;

/**
 * Created by yucheng on 2018/8/21.
 * 说明：
 * 我们也可以对Map利用Generator的方式进行容器的填充，但与Collection不同的是，
 * Map需要一个Pair(一对）类。因为为了组装Map，每次调用Generator的next()方法
 * 都必须产生一个对象对（一个键和一个值）
 */
public class Pair<K,V> {
    public final K key;
    public final V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
