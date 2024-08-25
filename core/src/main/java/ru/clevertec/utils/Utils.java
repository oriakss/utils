package ru.clevertec.utils;

import static ru.clevertec.utils.StringUtils.isPositiveNumber;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        boolean positiveNumbersFlag = true;
        for (String s : str) {
            if (!isPositiveNumber(s)) {
                positiveNumbersFlag = false;
            }
        }
        if (positiveNumbersFlag) {
            System.out.println("All numbers are positive");
        } else {
            System.out.println("Not all input data are positive numbers");
        }
        return positiveNumbersFlag;
    }
}