package ru.clevertec.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String s) {
        if (s == null) {
            System.out.println("Input cannot be null");
            return false;
        }
        if (s.matches("\\d+([.]\\d+)?")) {
            System.out.println(s + " is a positive number");
            return true;
        } else if (s.matches("-\\d+([.]\\d+)?")) {
            System.out.println(s + " isn't a positive number");
            return false;
        } else {
            System.out.println(s + " is an incorrect number");
            return false;
        }
    }
}