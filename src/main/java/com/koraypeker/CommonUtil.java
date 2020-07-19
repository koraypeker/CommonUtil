package com.koraypeker;

public class CommonUtil {

    public static <T> T nvl(T a, T b) {
        return (a == null) ? b : a;
    }

    public static <T> T zvl(T a, T b) {
        if (a == null) {
            return b;
        }
        return a.toString().equals("0") ? b : a;
    }

}
