package com.yc.io1811;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by yucheng on 2018/8/27.
 * 此类的原理很难理解：
 */
public class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        // 创建一个正则表达式对象
        pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
        // 将文件名与正则表达式进行匹配，用来过滤
        return pattern.matcher(name).matches();
    }
}
