package com.yc.io1811;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by yucheng on 2018/8/27.
 * 进一步来改进程序，因为我们发现DirList2中的static方法好像也没有必要
 * 优点：解决特定问题的代码隔离，聚拢于一点
 * 缺点：代码不易阅读和理解
 */
public class DirList3 {
    public static void main(final String[] args) {
        File path = new File("G:\\Android");
        String[] list;
        if (args.length == 0){
            list = path.list();
        }else{
            // 将匿名内部类放到参数内部
            list = path.list(new FilenameFilter() {
                Pattern pattern;
                // 匿名内部类是没有构造器的，如果想实现相同的功能，可以使用实例初始化
                {
                    // 此处需要用到regex参数，所以只能由外界传入
                    pattern = Pattern.compile(args[0]);
                }
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
        // 将返回的String[]数组list按指定要求排序
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
