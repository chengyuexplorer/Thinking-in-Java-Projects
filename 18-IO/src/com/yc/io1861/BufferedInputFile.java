package com.yc.io1861;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yucheng on 2018/8/27.
 * BufferReader:
 * 构造方法摘要
 * BufferedReader(Reader in)
 * 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 * BufferedReader(Reader in, int sz)
 * 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
 *
 * 常用方法：
 * int read()                                读取单个字符。
 * int read(char[] cbuf, int off, int len)   将字符读入数组的某一部分。
 * String readLine()                         读取一个文本行。
 *
 */
public class BufferedInputFile {
    public static String read(File filename) throws IOException{
        // 以行的方式来读取
        BufferedReader in = new BufferedReader(new FileReader(filename));
        // 定义一个字符串，用于接收每一行数据
        String s;
        // 定义一个StringBuilder用于存储读取的数据
        StringBuilder sb = new StringBuilder();
        // readLine()方法自动将换行符删除，因此我们需要补充
        // 当读完时，readLine返回的是null,而不是-1
        while ((s = in.readLine()) != null){
            sb.append(s + "\n");
        }
        // 关闭输入流
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        File filename = new File("README.md");
        System.out.println(read(filename));
    }
}
