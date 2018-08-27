package com.yc.mytest.copyOfFile;

import java.io.*;

/**
 * Created by yucheng on 2018/8/27.
 * 文件的复制与粘贴：
 * 步骤：
 * 1.读文件
 * 2.打散
 * 3.写入文件
 */
public class FileCopy {
    public static void main(String[] args) {
        // 定义在try...catch外部的原因：finally语句块中能够用到
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建输入流
            fis = new FileInputStream(new File("G:\\text.txt"));
            // 创建输出流
            fos = new FileOutputStream(new File("H:\\text.txt"));
            // 创建byte数组将数据打散
            byte[] bytes = new byte[1024];
            fis.read(bytes);
            System.out.println(new String(bytes));
            fos.write(bytes);
            // 刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }  if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
