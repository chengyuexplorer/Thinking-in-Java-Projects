package com.yc.io18100;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by yucheng on 2018/8/29.
 * 知识点：
 * 1.旧IO类库中有三个类被修改了，用以产生FileChannel。这三个被修改的类是FileInputStream、
 *   FileOutputStream和用于既读既写的RandomAccessFile。Reader和Writer这种字符模式不能用于产生通道
 */
public class GetChannel {
    private static final int BSIZE =1024;
    public static void main(String[] args) throws Exception {
        // 创建一个通道对象：注意：文件名是部分大小写的
        FileChannel fc = new FileOutputStream("daTa.txt").getChannel();
        //
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        // 关闭通道
        fc.close();

        fc = new RandomAccessFile("daTa.txt","rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        // 读文件
        fc = new FileInputStream("daTa.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);// 分配一个新的字节缓冲区
        fc.read(buff);
        buff.flip();// 反转此缓冲区
        while (buff.hasRemaining()){
            System.out.print((char)buff.get());
        }

    }
}
