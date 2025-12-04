package com.neeraj.leetcode202506.validwordabbreviation;

import java.util.Arrays;

public class ValidWordAbbreviationMain {

    public static void main(String[] args) {
        System.out.println("hello::hello = " +checkIfValid("hello","hello"));
        System.out.println("hello1::hello1 = " +checkIfValid("hello1","hello1"));
        System.out.println("hello1::hello1 = " +checkIfValid("hello11s","hello12345678901s"));
        System.out.println("hello1::hello1 = " +checkIfValid("i18n","internationalization"));
    }

    static boolean checkIfValid(String pattern, String word) {
        int wordIndex = 0;
        //char[] wordAsChars = word.toCharArray();
        for (int i = 0; i < pattern.length(); i++) {
            //System.out.println("pattern = " + pattern.charAt(i) + ", word = " + word.charAt(i));
            if (Character.isDigit(pattern.charAt(i))) {
                int consecutiveDigitCount = getConsecutiveDigitCount(pattern, i);
                String numberToSkipString = pattern.substring(i, i + consecutiveDigitCount);
                int numberTOSkip = Integer.parseInt(numberToSkipString);
                i = i - 1 + consecutiveDigitCount;
                //System.out.println("consecutiveDigitCount = " + consecutiveDigitCount + ", numberTOSkipString = " + numberTOSkipString);

                wordIndex += numberTOSkip;
            }
            else if(pattern.charAt(i) == word.charAt(wordIndex)) {
                wordIndex++;
            }
            else{
                return false;
            }
        }
        if(wordIndex==word.length()){
            return true;
        }
        else{
            return false;
        }
    }

    private static int getConsecutiveDigitCount(String pattern, int startingIndex) {
        int consecutiveDigitCount = 0;
        for (int i = startingIndex; i <= pattern.length() - 1; i++) {
            if (!Character.isDigit(pattern.charAt(i))) {
                break;
            }
            consecutiveDigitCount++;
        }
        return consecutiveDigitCount;
    }
}
