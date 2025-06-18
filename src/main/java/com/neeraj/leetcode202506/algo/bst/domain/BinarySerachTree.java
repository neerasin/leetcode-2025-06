package com.neeraj.leetcode202506.algo.bst.domain;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySerachTree {
    private Node root;

    public BinarySerachTree() {
    }

    public BinarySerachTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int value) {
        this.root = this.addRecursively(root, value);
    }

    private Node addRecursively(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        } else if (value < currentNode.value) {
            currentNode.left = this.addRecursively(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = this.addRecursively(currentNode.right, value);
        } else {
            return currentNode;
        }
        return currentNode;
    }

    public Node find(int value) {
        return this.findRecursively(root, value);
    }

    private Node findRecursively(Node currentNode, int value) {
        if(currentNode == null){
            return null;
        }
        else if(currentNode.value == value){
            return currentNode;
        }
        else if (value< currentNode.value){
            return findRecursively(currentNode.left, value);
        }
        else{
            return findRecursively(currentNode.right,value);
        }
    }

    public void traverseDFS() {
        System.out.println("Traversing DFS");
        this.traverseDFSRecursively(root);
    }

    private void traverseDFSRecursively(Node currentNode) {
        if(currentNode==null){
            return;
        }
        traverseDFSRecursively(currentNode.left);
        System.out.println("currentNode = " + currentNode);
        traverseDFSRecursively(currentNode.right);
    }


    public void traverseBFS() {
        System.out.println("Traversing BFS");
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println("Node: "+node);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }


    }
}
