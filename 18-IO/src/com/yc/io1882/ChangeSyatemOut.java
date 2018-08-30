package com.yc.io1882;

import java.io.PrintWriter;

/**
 * Created by yucheng on 2018/8/29.
 * System.out是一个PrintStream，而PrintStream是OutputStream，我们可以将System.out转换成PrintWriter
 */
public class ChangeSyatemOut {
    public static void main(String[] args) {
        // 需要开启自动刷新功能，否则可能看不见输出
        PrintWriter out = new PrintWriter(System.out,true);
        out.print("hello world");
        out.flush();
        // out.close();
    }
}
