package com.neeraj.leetcode202506.palindrome;

public class PalindromeMain {

    public static void main(String[] args) {
        System.out.println("kayak = " + checkForPalindrome("kayak"));
        System.out.println("level = " + checkForPalindrome("level"));
        System.out.println("kayyak = " + checkForPalindrome("kayyak"));
        System.out.println("kayiyak = " + checkForPalindrome("kayiyak"));
        System.out.println("kaxcak = " + checkForPalindrome("kaxcak"));
        System.out.println("kaxicak = " + checkForPalindrome("kaxicak"));
    }

    public static boolean checkForPalindrome(String s1){
        int left = 0;
        int right = s1.length()-1;
        while(left<right){
            if(s1.charAt(left) != s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
