package com.yc.container176;


/**
 * Created by yucheng on 2018/8/22.
 */
public class SetType {
    int i;
    public SetType(int n){
        i = n;
    }
    public boolean equals(Object o){
        return o instanceof SetType && (i == ((SetType)o).i);
    }
    public String toString(){
        return Integer.toString(i);
    }
}
