package com.thots.basics;

public class RepeatMe {
    public static void main(String[] args) {
        System.out.println("hey there");
        repeatMe(5);
    }

    public static void repeatMe(int times) {
        if (times > 0) {
            System.out.println("I'm repeating myself.. currently at " + times + " time");
            repeatMe(times - 1);
        }
    }
}