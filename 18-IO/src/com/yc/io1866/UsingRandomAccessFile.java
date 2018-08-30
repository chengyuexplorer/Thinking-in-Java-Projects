package com.yc.io1866;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by yucheng on 2018/8/29.
 * RandomAccessFile:
 * 说明：类似于组合使用了DataInputStream和DataOutputStream
 * 构造方法摘要 :
 * RandomAccessFile(File file, String mode)
 * 创建从中读取和向其中写入（可选）的随机访问文件流，该文件由 File 参数指定。
 * RandomAccessFile(String name, String mode)
 * 创建从中读取和向其中写入（可选）的随机访问文件流，该文件具有指定名称。

 */
public class UsingRandomAccessFile {
    static String file = "rtest.dat";
    static void display() throws IOException{
        // 以只读的方式创建输入流
        RandomAccessFile raf = new RandomAccessFile(file,"r");
        for (int i = 0; i < 7; i++){
            System.out.println("Value " + i + ": " + raf.readDouble());
        }
        System.out.println(raf.readUTF());
        raf.close();
    }

    public static void main(String[] args) throws IOException{
        // 以读写的方式创建输出流
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        for (int i = 0; i < 7; i++){
            raf.writeDouble(i*1.414);
        }
        raf.writeUTF("the end of file");
        raf.close();

        display();

        raf = new RandomAccessFile(file,"rw");
        raf.seek(5*8);
        raf.writeDouble(47.00001);
        raf.close();
        display();


    }
}
