package com.yc.annotation2023;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 注解处理器：它将读取一个类文件，检查其上的数据库注解，并生成用来创建数据库的SQL命令
 * @author yucheng
 * @date 2018/10/9
 */
public class TableCreator {
    /**
     * 根据约束的条件来生成SQL语句中关于约束的语句，并返回一个字符串
     * @param con
     * @return
     */
    private static String getConstraints(Constraints con){
        String constraints = "";
        // 不允许为空
        if(!con.allowNull()){
            constraints += " NOT NULL";
        }
        if(con.primaryKey()){
            constraints += " PRIMARY KEY";
        }
        if(con.unique()){
            constraints += " UNIQUE";
        }
        return constraints;
    }
    public static void main(String[] args) throws Exception{
        // 不是很理解
        if (args.length < 1){
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }

        // main方法会处理命令行传入的某一个类名，使用forName()加载每一个类
        for (String className : args){
            // 通过 每个类的类名 反射获取Class对象
            Class<?> cl = Class.forName(className);
            // 通过反射，判断该类中是否有DBTable注解，如果有则返回其对象，没有则返回null
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null){
                System.out.println("No DBTable annotation in class " + className);
                /**
                 * 补充：break与continue的区别：
                 * break:用于强制退出循环，不执行循环中的剩余的语句
                 * continue：停止执行当前的迭代，然后退出循环起始处，开始下一次迭代
                 */
                continue;
            }
            // 获取表名
            String tableName = dbTable.name();
            // 如果表名为空的话，直接用类名作为表名
            if (tableName.length() < 1){
                // 使用length来判断的目的是排除空字符串的影响
                tableName = cl.getName().toUpperCase();
            }
            // 定义一个ArrayList用来存储数据库表对应的生成的每个字段的SQL语句
            List<String> columnDefs = new ArrayList<>();
            // 获取所有字段，并逐个遍历
            for (Field field: cl.getDeclaredFields()){
                String columnName = null;
                // 获取在每个字段上的所有注解
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length < 1){
                    System.out.println("该字段不是数据库表对应的字段！");
                    continue;
                }
                // 这里有点问题：默认认为第一个注解就是SQL类型
                // 判断该字段是否是SQLInteger类型
                if (anns[0] instanceof SQLInteger){
                    // 强转一下
                    SQLInteger sInt = (SQLInteger) anns[0];
                    // 如果数据库字段名没有指定的话，就用类中的属性名
                    if (sInt.name().length() < 1){
                        columnName = field.getName().toUpperCase();
                    }
                    else {
                        columnName = sInt.name();
                    }
                    // 将字段名的SQL语句和约束的SQL语句 提高操作符重载，拼接在一起
                    columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
                }

                // 同理判断字段是否为SQLString类型
                if (anns[0] instanceof SQLString){
                    SQLString sString = (SQLString) anns[0];
                    if (sString.name().length() < 1){
                        columnName = field.getName().toUpperCase();
                    }
                    else {
                        columnName = sString.name();
                    }
                    columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")" + getConstraints(sString.constraints()));
                }

                // SQL命令：创建表
                StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName + "(");
                // SQL命令：创建字段
                for (String colunmDef : columnDefs){
                    createCommand.append("\n  " + colunmDef + ",");
                }
                // 去除最后一个逗号
                String tableCreate = createCommand.substring(0,createCommand.length() - 1) + ");";

                // 输出SQL语句
                System.out.println("Table Creation SQL for " + className + " is :\n" + tableCreate);

            }
        }
    }
}
