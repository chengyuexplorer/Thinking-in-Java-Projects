package com.yc.mytest.copyOfFile;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by yucheng on 2018/8/27.
 * FileReader与FileWriter的复制与粘贴
 */
public class FileCopy2 {
    public static void main(String[] args) throws Exception{
        // 创建输入流和输出流hro
        FileReader fr = new FileReader("G:text03.txt");
        FileWriter fw = new FileWriter("H:text03.txt");

        // 读取数据并将其打散成字符数组
        int temp = 0;
        char[] c = new char[512];
        while((temp = fr.read(c)) != -1){
            fw.write(c,0,temp);
        }

        // 刷新
        fw.flush();
        // 关闭
        fr.close();
        fw.close();
    }
}
