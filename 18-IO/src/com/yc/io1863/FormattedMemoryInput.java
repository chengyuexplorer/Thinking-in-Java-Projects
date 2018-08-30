package com.yc.io1863;

import com.yc.io1861.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;

/**
 * Created by yucheng on 2018/8/29.
 *
 * 构造方法摘要：
 * DataInputStream(InputStream in)
 * 使用指定的底层 InputStream 创建一个 DataInputStream。
 *
 * 方法：
 *  int read(byte[] b)
 *  从包含的输入流中读取一定数量的字节，并将它们存储到缓冲区数组 b 中。
 *  int read(byte[] b, int off, int len)
 *  从包含的输入流中将最多 len 个字节读入一个 byte 数组中。


 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(
                new ByteArrayInputStream(
                        BufferedInputFile.read(
                              new File("README.md")).getBytes()));
        // 会抛出EOFException异常，因为while循环无法结束
       /* while (true){
            System.out.print((char)(dis.readByte()));
        }*/
       // 方法一：
     /*   while(dis.available() != 0){
            // 汉字还是会出现乱码
            System.out.print((char)(dis.readByte()));
        }*/

        // 方法二
        int temp;
        byte[] cbuf = new byte[512];
        while ((temp = dis.read(cbuf)) != -1){
            System.out.println(new String(cbuf));
        }
    }
}
