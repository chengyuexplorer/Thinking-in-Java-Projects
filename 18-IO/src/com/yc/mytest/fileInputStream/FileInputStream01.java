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

 */
public class FileInputStream01 {
    public static void main(String[] args) {
        //
        FileInputStream fis = null;
        try {
            // 1.创建输入流
            String filepath = "G:\\text.txt";// 路径
            // or String filepath = "G:/text.txt";
            fis = new FileInputStream(filepath);

            // 2.读取 一次只能读取一个字节
            int i1 = fis.read();// 返回的是ASCII值
            int i2 = fis.read();
            int i3 = fis.read();

            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
