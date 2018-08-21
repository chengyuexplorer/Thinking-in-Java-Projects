package com.yc.array1662;

/**
 * Created by yucheng on 2018/8/13.
 * 生成器：专门创建对象的类，并且无需知道额外的信息
 */
public interface Generator<T> {
    // 返回T类型的对象
    T next();
}
