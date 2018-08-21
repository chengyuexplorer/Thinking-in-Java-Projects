package com.yc.generic1520;

/**
 * Created by yucheng on 2018/8/17.
 * 以Object类型为参数类型，因为我们所有的类都是从Object继承而来
 * 所以理论上说，我们可以通过Object类型参数，传入任何我们想要的类型
 * 不足之处：需要我们进行强制类型转换
 */
public class Holder2 {
    private Object o;
    public Holder2(Object o) {
        this.o = o;
    }
    public Object getO() {
        return o;
    }
    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        // 传入Automobile类型的对象
        Holder2 h2 = new Holder2(new Automobile());
        // 麻烦之处：强转
        Automobile a = (Automobile) h2.getO();
        System.out.println(a);
        // ----------------------------------------------
        h2.setO("hello world");
        String str = (String) h2.getO();
        System.out.println(str);
    }
}
