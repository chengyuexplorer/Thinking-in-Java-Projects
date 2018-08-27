package com.yc.io1812;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by yucheng on 2018/8/27.
 */
public final class Directory {
    public static File[] local(File dir, final String regex){
        return dir.listFiles(new FilenameFilter() {
            Pattern pattern;
            // 匿名内部类是没有构造器的，如果想实现相同的功能，可以使用实例初始化
            {
                // 此处需要用到regex参数，所以只能由外界传入
                pattern = Pattern.compile(regex);
            }
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex){// 方法重载
        return local(new File(path),regex);
    }
    // 静态内部类
    public static class TreeInfo implements Iterable<File>{
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }
        void addAll(TreeInfo others){
            files.addAll(others.files);
            dirs.addAll(others.dirs);
        }
        public String toString(){
            return "dirs: " ;
        }
    }
}
