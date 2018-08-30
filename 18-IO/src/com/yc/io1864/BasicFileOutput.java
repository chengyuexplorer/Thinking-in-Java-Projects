package com.yc.io1864;

import com.yc.io1861.BufferedInputFile;

import java.io.*;

/**
 * Created by yucheng on 2018/8/29.
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";
    public static void main(String[] args) throws Exception{
        // 创建输入流
        BufferedReader in = new BufferedReader(
                                new StringReader(
                                        BufferedInputFile.read(
                                                new File("README.md"))));
        // 创建输出流
        PrintWriter out = new PrintWriter(
                                 new BufferedWriter(
                                         new FileWriter(file)));
        int linecount = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(linecount++ + ": " + s);
        }
        out.close();
        // 奇怪：要是不显示调用close()方法，下面输出内容就没有
        System.out.println(BufferedInputFile.read(new File(file)));
    }
}
