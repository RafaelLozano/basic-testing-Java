package com.rafaDev.java.test.utils;

public class PasswordUtil {
    public enum securityLevels{
        WEAK, MEDIUM, STRONG
    }

    public static securityLevels checkPassword(String password){
        if(password.length()<8 || password.matches("[a-zA-Z]+")){
            return securityLevels.WEAK;
        }
        if(password.matches("[a-zA-Z0-9]+")){
            return securityLevels.MEDIUM;
        }
        return securityLevels.STRONG;
    }

}
