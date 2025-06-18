package com.neeraj.leetcode202506.twosumsortedarray;

public class TwoSumSortedArray {

    public static void main(String[] args) {
        System.out.println("5 = " + checkForTarget(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 5));
        System.out.println("50 = " + checkForTarget(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 50));
        System.out.println("6 = " + checkForTarget(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 6));
    }

    public static boolean checkForTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}

