package com.yc.io1811;

import java.io.File;
import java.util.Arrays;

/**
 * Created by yucheng on 2018/8/27.
 */
public class DirList {
    public static void main(String[] args) {

        File path = new File("G:\\Android");
        String[] list;
        if (args.length == 0){
            list = path.list();
        }else{
            list = path.list(new DirFilter(args[0]));
        }
        // 将返回的String[]数组list按指定要求排序
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("======================");
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }

    }
}
