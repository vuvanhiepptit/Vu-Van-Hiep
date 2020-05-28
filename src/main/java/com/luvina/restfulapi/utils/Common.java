package com.luvina.restfulapi.utils;

public class Common {
    public static boolean checkHalfSize(String input) {
        return input.matches("^[0-9]{1,}$");
    }

    public static String replaceString(String text) {
        return text.replace(" ", "").replace("-", "");
    }
}
