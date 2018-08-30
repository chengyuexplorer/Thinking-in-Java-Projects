package com.yc.io1865;

import java.io.*;

/**
 * Created by yucheng on 2018/8/29.
 * 存储和恢复数据
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws Exception{
        // 创建输出流
        DataOutputStream out = new DataOutputStream(
                                     new BufferedOutputStream(
                                           new FileOutputStream("Data.txt")));
        // 写入数据
        out.writeDouble(3.14159);
        out.writeUTF("this was pi");
        out.writeDouble(1.41413);
        out.writeUTF("square root of 2");
        out.close();

        // 创建输入流
        DataInputStream in = new DataInputStream(
                                     new BufferedInputStream(
                                             new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

        System.out.println(in.readDouble());
        System.out.println(in.readUTF());


    }
}
