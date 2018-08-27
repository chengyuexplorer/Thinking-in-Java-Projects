package com.yc.io1811;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by yucheng on 2018/8/27.
 * 利用匿名内部类的方式实现上面的类
 */
public class DirList2 {
    // 创建静态方法，用来返回FilenameFilter对象
    // 因为在匿名内部类中要用到regex，因此其必须被定义为final
    public static FilenameFilter filter(final String regex){
        // 匿名内部类
        return new FilenameFilter() {
            Pattern pattern;
            // 匿名内部类是没有构造器的，如果想实现相同的功能，可以使用实例初始化
            {
                // 此处需要用到regex参数，所以只能由外界传入
                pattern = Pattern.compile(regex);
            }
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }
    public static void main(String[] args) {
        File path = new File("G:\\Android");
        String[] list;
        if (args.length == 0){
            list = path.list();
        }else{
            list = path.list(filter(args[0]));
        }
        // 将返回的String[]数组list按指定要求排序
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
