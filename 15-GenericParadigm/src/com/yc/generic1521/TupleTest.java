package com.yc.generic1521;

/**
 * Created by yucheng on 2018/8/13.
 */
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("张三",23);
    }
    static ThreeTuple<Amphibian,String,Integer> g(){

        return new ThreeTuple<>(new Amphibian(),"李四",24);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){

        return new FourTuple<>(new Vehicle(), new Amphibian(),"李四",24);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){

        return new FiveTuple<>(new Vehicle(), new Amphibian(),"李四",24,11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        // compile error :first是final，不能被修改
        // ttsi.first = "ds";
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
