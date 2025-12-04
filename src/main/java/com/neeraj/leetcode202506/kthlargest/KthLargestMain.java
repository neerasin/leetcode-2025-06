package com.neeraj.leetcode202506.kthlargest;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestMain {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,4,3,6,5,8,7,9,10};
        int[] arr2 = new int[]{11,21,4,3,6,5,8,7,9,10};
        System.out.println("arr1 = " + findKthLargest1(arr1, 1));
        System.out.println("arr1 = " + findKthLargest1(arr1, 2));
        System.out.println("arr1 = " + findKthLargest1(arr1, 5));


        System.out.println("arr1 = " + findKthLargest(arr1, 1));
        System.out.println("arr1 = " + findKthLargest(arr1, 2));
        System.out.println("arr1 = " + findKthLargest(arr1, 5));
    }

    private static int findKthLargest(int[] arr, int k){
        int result = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int a=0; a< arr.length;a++){
            heap.add(arr[a]);
            if(heap.size()>k){
                heap.remove();
            }
        }

        return heap.peek();
    }

    private static int findKthLargest1(int[] arr, int k){
        int result = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int a=0; a< arr.length;a++){
            heap.add(arr[a]);
        }
        for(int i=0; i<k;i++){
            result = heap.remove();
        }

        return result;
    }
}
