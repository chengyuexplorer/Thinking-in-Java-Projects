package com.yc.io1871;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by yucheng on 2018/8/29.
 * 此类用来解决读取二进制文件
 */
public class BinaryFile {
    // 接收File参数
    public static byte[] read(File bFile) throws IOException{
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
        // available(): 返回可以从此输入流读取（或跳过）、且不受此输入流接下来的方法调用阻塞的估计字节数。
        try {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            return data;
        } finally {
            bf.close();
        }
    }

    // 重载read()方法,接收文件的Strinf参数
    public static byte[] read(String bFile) throws IOException{
        return read(new File(bFile).getAbsolutePath());
    }
    public static void main(String[] args) {

    }
}
