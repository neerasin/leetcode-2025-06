package com.neeraj.leetcode202506.lruCache;

import java.util.Arrays;

public class LRUCacheMain {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println("get = " + cache.get(1));
        cache.put(3,3);
        System.out.println("get = " + cache.get(2));
        cache.put(4,4);
        System.out.println("get = " + cache.get(1));
        System.out.println("get = " + cache.get(3));
        System.out.println("get = " + cache.get(4));


/*
["LRUCache",    "put",      "put",      "get",  "put",      "get",  "put",      "get",      "get",      "get"]
[[2],           [1, 1],     [2, 2],     [1],    [3, 3],     [2],    [4, 4],     [1],        [3],        [4]]
[null,          null,       null,       1,      null,       -1,     null,       -1,         3,          4]
 */

    }
}
