package com.neeraj.leetcode202506.palindrome;

import java.util.Arrays;

public class ValidPalindromAgain {

    public static void main(String[] args) {
        System.out.println("kayak = " + checkForPalindrome("kayak"));
        System.out.println("level = " + checkForPalindrome("level"));
        System.out.println("kayyak = " + checkForPalindrome("kayyak"));
        System.out.println("kayiyak = " + checkForPalindrome("kayiyak"));
        System.out.println("kaxcak = " + checkForPalindrome("kaxcak"));
        System.out.println("kaxicak = " + checkForPalindrome("kaxicak"));
    }

    private static boolean checkForPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
