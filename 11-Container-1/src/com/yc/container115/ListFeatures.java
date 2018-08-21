package com.yc.container115;

import java.util.*;

/**
 * Created by yucheng on 2018/8/20.
 * List:
 * ArrayList：长于随机访问元素，但是插入和删除效率较低
 * LikedList：长于插入和删除元素，但随机访问的效率较低
 *
 * 因为书中的例子实在是过于复杂，在此就不将代码全部展示了,此例为本人根据
 * 书中所讲的主要知识点进行了一些改动，尽量使展示的效果保持一致
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(13);
        // 根据实例结果来创建集合
        List<String> pets = new ArrayList<>(Arrays.asList("Rat","Manx","Cymric","Mutt","Pug",
                "Cymric","Pug","Hamster"));
        System.out.println("1:" + pets);
        // 添加对象：容器会自动扩容
        pets.add("Hamster");
        System.out.println("2:" + pets);
        // 判断是否包含某个对象
        System.out.println("3：" + pets.contains("Hamster"));
        // 删除某个对象
        System.out.println("4：" + pets.remove("Hamster"));

        // 判断某个元素在集合中所处的位置，即对应的索引号
        String str = pets.get(2);
        // 显示的是第一个str对象的索引
        System.out.println("5："  + pets.indexOf(str));
        // 显示的是最后一个str对象的索引
        System.out.println("6：" + pets.lastIndexOf(str));

        // 获取子集合：含1不含4
        List<String> subPets = pets.subList(1,4);
        System.out.println("7：" + subPets);

        // 排序
        Collections.sort(subPets);// 按自然顺序排列
        System.out.println("8 sorted subPets：" + subPets);

        // 置换：使用指定的随机源对集合进行置换
        Collections.shuffle(subPets,random);

        // 复制
        List<String> copy = new ArrayList<>(pets);
        // 用第2、5个元素填充subPet
        subPets = Arrays.asList(pets.get(1),pets.get(4));
        System.out.println("9：" + subPets);

        // 交集
        copy.retainAll(subPets);// 取交集，注意此时相同元素的影响
        System.out.println("10：" + copy);

        // 移除所有元素
        copy = new ArrayList<>(pets);// 重新获取一个copy
        copy.remove(2);
        System.out.println("11 copy = ：" + copy);
        System.out.println("12：subPets = " + subPets);
        copy.removeAll(subPets);
        System.out.println("13 after removeAll：" + copy);

        // addAll()
        // 在集合的中间插入集合
        copy.addAll(2,subPets);
        System.out.println("14 after Collection.addAll(int index,Collection c)：" + copy);
        // 在尾部插入
        copy.addAll(subPets);
        System.out.println("15 after Collection.addAll()：" + copy);






    }
}
