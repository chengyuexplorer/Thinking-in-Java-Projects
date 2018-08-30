package com.yc.io1883;

import java.io.*;

/**
 * Created by yucheng on 2018/8/29.
 */
public class Redirecting {
    public static void main(String[] args) throws IOException{
        PrintStream console = System.out;
        // 创建输入流
        BufferedInputStream in = new BufferedInputStream(
                                         new FileInputStream("README.md"));
        // 创建打印流(输出流)
        PrintStream out = new PrintStream(
                                         new BufferedOutputStream(
                                                 new FileOutputStream("testout.txt")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(
                                         new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        out.close();
        // 最后定向回来
        System.setOut(console);
    }
}
