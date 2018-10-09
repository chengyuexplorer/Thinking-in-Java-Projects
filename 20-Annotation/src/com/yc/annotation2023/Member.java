package com.yc.annotation2023;

/**
 * 注解在JavaBean中的应用
 * @author yucheng
 * @date 2018/10/9
 */
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String firstname;
    @SQLString(40)
    String lastname;
    @SQLInteger
    Integer age;
    @SQLString(value = 30,constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public Integer getAge() {
        return age;
    }
    public String getHandle() {
        return handle;
    }
    @Override
    public String toString() {
        return "Member{" +
                "handle='" + handle + '\'' +
                '}';
    }
}
