package com.yc.mytest.fileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yucheng on 2018/8/27.
 *
 * FileOutputStream的用法：
 * 构造器：
 * FileOutputStream(File file)
 * 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 * FileOutputStream(File file, boolean append)
 * 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 * FileOutputStream(String name)
 * 创建一个向具有指定名称的文件中写入数据的输出文件流。
 * FileOutputStream(String name, boolean append)
 * 创建一个向具有指定 name 的文件中写入数据的输出文件流。
 *
 * 方法：
 * void write(byte[] b)
 * 将 b.length 个字节从指定 byte 数组写入此文件输出流中。
 * void write(byte[] b, int off, int len)
 * 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
 * void write(int b)
 * 将指定字节写入此文件输出流。

 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        // 创建引用
        FileOutputStream fos = null;
        try {
            // 1.创建流对象
            File filepath = new File("G:\\text02.txt");// 创建File对象
            fos = new FileOutputStream(filepath);// 以覆盖的方式写入
            // fos = new FileOutputStream(filepath,true);// 以追加方式写入
            String str = "hello world!";
            // 将字符串打散
            byte[] bytes = str.getBytes();
            fos.write(bytes);

            // 刷新：目的在于将文件整个读入
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    // 3.关闭流对象
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
