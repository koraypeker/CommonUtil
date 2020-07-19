package com.koraypeker;

import java.math.BigDecimal;

public class NumericUtil {

    public static Double parseDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double parseDoubleWithDefault(String number, Double defaultValue) {
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static Long parseLong(String number) {
        try {
            return Long.parseLong(number);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Long parseLongWithDefault(String number, Long defaultValue) {
        try {
            return Long.parseLong(number);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static Integer parseInteger(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Integer parseIntegerWithDefault(String number, int defaultValue) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static BigDecimal parseBigDecimal(String number) {
        try {
            return new BigDecimal(number);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
