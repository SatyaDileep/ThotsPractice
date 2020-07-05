package com.thots.basics.recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] atg) {
        System.out.println("Enter the input string..[sentences are not allowed :P] ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        scanner.close();
        System.out.println("Checking if the input string is palindrome or not..");
        
        char[] charArray = inputString.toCharArray();
        String outputMessage = isPalindrome(charArray, 0, charArray.length-1) ? "palindrome" : "not a palindrome";
        System.out.println("given string "+inputString+" is "+outputMessage);
    }

    static boolean isPalindrome(char[] charArray, int begin, int end) {
        System.out.println(charArray[begin]+" // "+charArray[end]);
        if (begin >= end)
            return true;
        if (charArray[begin] != charArray[end])
            return false;
        return isPalindrome(charArray, begin + 1, end - 1);
    }
}