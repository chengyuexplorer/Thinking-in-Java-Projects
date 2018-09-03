package com.yc.enum19101;

import com.yc.enum1960.Enums;

import java.util.Iterator;

/**
 * Created by yucheng on 2018/8/30.
 */
public class Mail {
    // 定义枚举
    enum GeneralDelivery {YES,NO1,NO2,NO3,NO4,NO5}
    enum Scannability {UNSCANNABLE,YES1,YES2,YES3,YES4}
    enum Readability {ILLEGIBLE,YES1,YES2,YES3,YES4}
    enum Address {INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}
    enum ReturnAddress {MISSING,OK1,OK2,OK3,OK4,OK5}

    // 定义枚举引用
    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;

    static long counter = 0;
    long id = counter++;
    public String toString(){
        return "Mail " + id;
    }
    public String details(){
        return toString() + ", General Delivery: " + generalDelivery +
                            ", Address Scannability: " + scannability +
                            ", Address Readability: " + readability +
                            ", Address Address: " + address +
                            ", Return address: " + returnAddress;
    }

    public static Mail randomMail(){
        // 用邮件对象来存储枚举实例
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannability =Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }

    // 连用两个匿名内部类
    public static Iterable<Mail> genertor(final int count){
        return new Iterable<Mail>() {
            int n = count;
            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
