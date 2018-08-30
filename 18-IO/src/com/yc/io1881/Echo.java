package com.yc.io1881;

import java.io.*;

/**
 * Created by yucheng on 2018/8/29.
 * System.out、System.err都是一个事先被包装过的经过加工的PrintStream，因此我们可以直接用
 * 但是System.in是未被包装过的InputStream，因此在用之前需要我们对其进行包装
 */
public class Echo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && s.length() != 0){
            System.out.println(s);
        }
    }
}
