package com.yc.io1862;

import com.yc.io1861.BufferedInputFile;

import java.io.File;
import java.io.StringReader;

/**
 * Created by yucheng on 2018/8/28.
 *
 * 构造方法摘要:
 * StringReader(String s)
 * 创建一个新字符串 reader。
 *
 * 方法：
 *  int read()
 *  读取单个字符。
 *  int read(char[] cbuf, int off, int len)
 *  将字符读入数组的某一部分。
 */
public class MemoryInput {
    public static void main(String[] args) throws Exception{
        // 创建字符串输入流
        StringReader sr = new StringReader(BufferedInputFile.read(new File("README.md")));
        char[] cbuf = new char[512];
        int temp;
        while ((temp = sr.read(cbuf)) != -1){
            System.out.println(cbuf);
        }
        // 关闭输入流
        sr.close();
    }
}
