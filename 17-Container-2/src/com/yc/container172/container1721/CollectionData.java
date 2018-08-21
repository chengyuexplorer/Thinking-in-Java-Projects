package com.yc.container172.container1721;

import java.util.ArrayList;

/**
 * Created by yucheng on 2018/8/21.
 * 此类的作用：
 * 通过传递过来的生成器Generator和quantity将数据存储在自身对象中，并以集合的方式提供给外界
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        // 通过生成器Generator将要生成的对象添加到CollectionData对象中
        // 即对象将数据存储在自身当中
        for (int i = 0; i < quantity; i++)
            add(gen.next());
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        // 返回对象实例，实际也就是返回一个带有数据的集合
        // （因为此类继承自ArrayList，因而它具有存储数据的功能）
        return new CollectionData<>(gen,quantity);
    }
}
