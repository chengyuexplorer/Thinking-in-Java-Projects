package com.yc.mytest.fileReader;

import java.io.FileReader;

/**
 * Created by yucheng on 2018/8/27.
 * 字节流：
 * 优点：可以读取各种文件，文本、图片、视频等
 * 缺点：容易出现乱码的情况；一次读一个字节，但一个汉字占两个字节，会出现读半个汉字的情况
 *
 * 构造方法摘要:
 * FileReader(File file)
 * 在给定从中读取数据的 File 的情况下创建一个新 FileReader。
 * FileReader(String fileName)
 * 在给定从中读取数据的文件名的情况下创建一个新 FileReader。
 *
 * 问题：中文乱码问题


 */
public class MyFileReader {
    public static void main(String[] args) throws Exception{
        // 创建输入流
        FileReader fr = new FileReader("G:\\text.txt");
        // 创建字符数组，注意与字节数组的区别
        char[] cs = new char[512];// 1024Byte = 1kb
        fr.read(cs);
        System.out.println(new String(cs));

        // 关闭
        fr.close();
    }
}
