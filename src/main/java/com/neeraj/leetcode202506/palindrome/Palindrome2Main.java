package com.neeraj.leetcode202506.palindrome;

public class Palindrome2Main {

    public static void main(String[] args) {
        System.out.println("kayak1 = " + checkForPalindrome2("kayak", 1));
        System.out.println("level = " + checkForPalindrome2("level", 1));
        System.out.println("kay12345yak = " + checkForPalindrome2("kay12345yak", 3));

        System.out.println("kayak1 = " + checkForPalindrome2("kayak"));
        System.out.println("level = " + checkForPalindrome2("level"));
        System.out.println("kay12345yak = " + checkForPalindrome2("kay123yak"));
    }

    //Given a string s, return true if the s can be palindrome after deleting at most one character from it.
    public static boolean checkForPalindrome2(String s1, int substitutionAllowed) {
        int left = 0;
        int right = s1.length() - 1;
        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right)) {

                if (substitutionAllowed >= 1) {
                    String s2 = s1.substring(left, right);
                    String s3 = s1.substring(left + 1, right + 1);
                    //Check once for palindrome after removing left char and then right car.
                    boolean leftRemovalAnswer = checkForPalindrome2(s2, substitutionAllowed - 1);
                    boolean rightRemovalAnswer = checkForPalindrome2(s3, substitutionAllowed - 1);
                    return leftRemovalAnswer || rightRemovalAnswer;
                } else {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean checkForPalindrome2(String s1) {
        int left = 0;
        int right = s1.length() - 1;
        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right)) {

                String s2 = s1.substring(left, right);
                String s3 = s1.substring(left + 1, right + 1);
                //Check once for palindrome after removing left char and then right car.
                boolean leftRemovalAnswer = checkForPalindrome2(s2,0);
                boolean rightRemovalAnswer = checkForPalindrome2(s3,0);
                return leftRemovalAnswer || rightRemovalAnswer;

            }
            left++;
            right--;
        }
        return true;
    }

}
