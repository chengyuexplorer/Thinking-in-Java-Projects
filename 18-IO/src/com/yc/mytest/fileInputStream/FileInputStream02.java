package com.yc.mytest.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by yucheng on 2018/8/27.
 * FileInputStream：
 * 构造器：
 * 1.FileInputStream(File file)
 * 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
 * 2.FileInputStream(String name)
 * 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 *
 * 读取文件的步骤：
 * 1.创建输入流
 * 2.读取
 * 3.关闭
 *
 * 方法：
 * int read()
 * 从此输入流中读取一个数据字节。
 * 返回：下一个数据字节；如果已到达文件末尾，则返回 -1。
 *
 * int read(byte[] b)
 * 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 * 返回：读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
 *
 * int read(byte[] b, int off, int len)
 * 从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
 * 返回：读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
 *
 * text:
 * asuciqwuvebcqoawudcbjociayb
 *
 * 字节流的问题：
 * 1.容易出现乱码
 * 2.每个汉字占两个字节，会出现半个汉字的情况

 */
public class FileInputStream02 {
    public static void main(String[] args) throws Exception{
        // 1.创建流
        String filepath = "G:\\text.txt";// 路径
        FileInputStream fis = new FileInputStream(filepath);

        // 读取数据
        // 创建byte数组：一个英文字母占一个字节，一个汉字占两个字节
        // 分析：将前十个字节封装成一个byte数组，bytes里面存储的是10个字母，即10字节
        // byte[] bytes = new byte[10];
        byte[] bytes2 = new byte[5];
        // int m = fis.read(bytes);
        int m2 = fis.read(bytes2);
        // System.out.println(m);// 10
        System.out.println(new String(bytes2));// asuciqwuve

        fis.close();

    }
}
