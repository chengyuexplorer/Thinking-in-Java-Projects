package com.yc.annotation2011;

import java.util.List;

/**
 * Created by yucheng on 2018/9/6.
 */
public class PasswordUtils {
    @UseCase(id = 47, description = "Passeords must contain at least one numeric")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prePasswords, String password){
        return !prePasswords.contains(password);
    }
}
