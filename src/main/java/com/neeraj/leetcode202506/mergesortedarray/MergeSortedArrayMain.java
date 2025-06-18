package com.neeraj.leetcode202506.mergesortedarray;

import java.util.Arrays;

public class MergeSortedArrayMain {

    public static void main(String[] args) {
        int[] arr1={1,2,6,7,8,5,20};
        int[] arr2={3,4,6,7,8,9,10};
        System.out.println("Result = " + Arrays.toString(merge(arr1,arr2)));
    }

    public static int[] merge(int [] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[i+j]=arr1[i];
                i++;
            }
            else{
                result[i+j]=arr2[j];
                j++;
            }
        }

        while(i<arr1.length){
            result[i+j]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            result[i+j]=arr2[j];
            i++;
        }

        return result;
    }
}
