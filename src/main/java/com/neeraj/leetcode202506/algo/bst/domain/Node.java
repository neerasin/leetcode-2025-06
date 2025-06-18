package com.neeraj.leetcode202506.algo.bst.domain;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        left=null;
        right=null;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
