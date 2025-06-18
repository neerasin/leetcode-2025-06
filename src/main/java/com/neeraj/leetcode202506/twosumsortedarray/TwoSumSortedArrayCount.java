package com.neeraj.leetcode202506.twosumsortedarray;

public class TwoSumSortedArrayCount {

    public static void main(String[] args) {
        System.out.println("5 = " + checkForTarget(new int[]{0,1,2,3,4,5,6,7,8}, 5));
        System.out.println("50 = " + checkForTarget(new int[]{0,1,2,3,4,5,6,7,8}, 50));
        System.out.println("6 = " + checkForTarget(new int[]{0,1,2,3,4,5,6,7,8}, 6));
    }

    public static int checkForTarget(int[] arr, int target){
        int matchCount = 0;

        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                matchCount++;
                left++;
            }
            else if(sum> target){
                right --;
            }
            else{
                left++;
            }
        }
        return matchCount;
    }
}

