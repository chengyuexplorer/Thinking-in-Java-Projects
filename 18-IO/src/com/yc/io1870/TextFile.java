package com.yc.io1870;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by yucheng on 2018/8/29.
 * 在这里我们创建了一个使用的文件读写工具
 */
public class TextFile extends ArrayList<String> {
    // 根据文件名，读取文件数据，并返回一个字符串
    public static String read(String filename){
        StringBuilder sb = new StringBuilder();
        try {
            // 创建输入流
            // getAbsoluteFile()：表示返回此抽象路径的绝对路径形式
            BufferedReader in = new BufferedReader(
                                       new FileReader(
                                             new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null){
                    // 以readLine()方法读取数据的时候，会自动去除末尾的行分隔符，因此需要我们加上
                    sb.append(s + "\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
        return sb.toString();
    }

    // 将传入的字符串text，输出到文件filename中
    public static void write(String filename, String text){
        try {
            PrintWriter out = new PrintWriter(
                                    new File(filename).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 构造器：
    public TextFile(String filename, String splitter){
        super(Arrays.asList(read(filename).split(splitter)));
        //
        // 规则的表达式经常在首位留出一个空格，此处将其去除
        if (get(0).equals(" ")) remove(0);
    }
    public TextFile(String filename){
        this(filename,"/n");
    }

    public void write(String filename){
        try {
            PrintWriter out = new PrintWriter(
                                      new File(filename).getAbsoluteFile());
            try {
                for (String item:this) {
                    out.println(item);
                }
            } finally {
               out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // 用read()方法读取文件README.md的数据，并返回一个字符串
        String file = read("README.md");
        // 调用静态方法write(),将内存中的字符串file输出到文件text.txt中
        write("test.txt",file);
        // 创建text对象，并将test.txt文件中的数据存储到对象中。以行为分隔符
        TextFile text = new TextFile("test.txt");
        // 将对象arraylist中的数据写入到test2.txt中
        text.write("test2.txt");

        //
        TreeSet<String> words = new TreeSet<>(new TextFile("Thinking-in-Java-Projects.iml","//W+"));
        System.out.println(words.headSet("a"));
    }
}
