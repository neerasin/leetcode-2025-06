package com.neeraj.leetcode202506.mergesortedarray;

import java.util.Arrays;

public class MergeSortedArray2 {

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(merge(new int[]{3, 4, 6, 7, 8, 9, 10}, new int[]{2, 3, 5, 6, 7, 8, 9, 10})));

    }

    private static int[] merge(int[] firstArray, int[] secondArray) {
        int a = 0;
        int b = 0;
        int[] sortedArray = new int[firstArray.length + secondArray.length];
        while (a < firstArray.length && b < secondArray.length) {
            if (firstArray[a] < secondArray[b]) {
                sortedArray[a + b] = firstArray[a];
                a++;
            } else {
                sortedArray[a + b] = secondArray[b];
                b++;
            }
        }
        while (a < firstArray.length) {
            sortedArray[a + b] = firstArray[a];
            a++;
        }
        while (b < secondArray.length) {
            sortedArray[a + b] = secondArray[b];
            b++;
        }
        return sortedArray;

    }
}
