package com.yc.container172.container1722;

import com.yc.container172.container1721.Generator;

import java.util.LinkedHashMap;

/**
 * Created by yucheng on 2018/8/21.
 * 说明：因为Map由key和value组成，因此会有各种各样的组合方式
 */
public class MapData<K,V> extends LinkedHashMap<K,V> {
    // 1.单一的Pair生成器
    public MapData(Generator<Pair<K,V>> gen, int quantity){
        for (int i = 0; i < quantity; i++){
            // 麻烦之处：需要将Key和Value取出，再插入
            Pair<K,V> p = gen.next();
            put(p.key,p.value);
        }
    }
    // 2.将Key和Value分开，作为两个Generator
    public MapData(Generator<K> genK,Generator<V> genV,int quantity){
        for (int i = 0; i < quantity; i++){
            put(genK.next(),genV.next());
        }
    }
    // 3.一个Key的Generator和一个常量值
    public MapData(Generator<K> genK, V value,int quantity){
        for (int i = 0; i < quantity; i++){
            put(genK.next(),value);
        }
    }
    // 4.一个Iterator一个Generator
    public MapData(Iterable<K> genK,Generator<V> genV){
        for (K key:genK){
            put(key,genV.next());
        }
    }
    // 5.一个Iterator一个单一值
    public MapData(Iterable<K> genK,V value){
        for (K key:genK){
            put(key,value);
        }
    }


    public static <K,V> MapData<K,V> map(Generator<Pair<K,V>> gen, int quantity){
        return new MapData<K, V>(gen,quantity);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK,Generator<V> genV,int quantity){
        return new MapData<K, V>(genK,genV,quantity);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK, V value,int quantity){
        return new MapData<K, V>(genK,value,quantity);
    }
    public static <K,V> MapData<K,V> map(Iterable<K> genK,Generator<V> genV){
        return new MapData<K, V>(genK,genV);
    }
    public static <K,V> MapData<K,V> map(Iterable<K> genK,V value){
        return new MapData<K, V>(genK,value);
    }
}
