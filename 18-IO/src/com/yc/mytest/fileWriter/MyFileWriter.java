package com.yc.mytest.fileWriter;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by yucheng on 2018/8/27.
 * 构造方法摘要:
 * FileWriter(File file)
 * 根据给定的 File 对象构造一个 FileWriter 对象。
 * FileWriter(File file, boolean append)
 * 根据给定的 File 对象构造一个 FileWriter 对象。
 * FileWriter(String fileName)
 * 根据给定的文件名构造一个 FileWriter 对象。
 * FileWriter(String fileName, boolean append)
 * 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
 *
 * 方法说明：
 * FileWriter继承了Writer和OutputStream的两个的方法;
 * Writer的常用方法：
 * Writer append(char c)                                :将指定字符添加到此 writer。
 * Writer append(CharSequence csq)                      :将指定字符序列添加到此 writer。
 * Writer append(CharSequence csq, int start, int end)  :将指定字符序列的子序列添加到此 writer.Appendable。
 * void write(char[] cbuf)                              :写入字符数组。
 * abstract  void write(char[] cbuf, int off, int len)  :写入字符数组的某一部分。
 * off - 相对初始写入字符的偏移量
 * len - 要写入的字符数
 * void write(int c)                                    :写入单个字符。
 * void write(String str)                               :写入字符串。
 * void write(String str, int off, int len)             :写入字符串的某一部分。


 */
public class MyFileWriter {
    public static void main(String[] args) throws Exception{
        // 创建输出流
        FileWriter fw = new FileWriter(new File("G:\\test03.txt"));
        // 输入字符串
        fw.write("你好呀！");
        fw.write(97);// 这里的int型value指的是ASCII值
        fw.write(new char[]{'q','a','v'});
        fw.append('d');

        // 刷新
        fw.flush();
        // 关闭
        fw.close();

    }
}
