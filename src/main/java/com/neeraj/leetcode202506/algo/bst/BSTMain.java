package com.neeraj.leetcode202506.algo.bst;

import com.neeraj.leetcode202506.algo.bst.domain.BinarySerachTree;
import com.neeraj.leetcode202506.algo.bst.domain.Node;

public class BSTMain {

    public static void main(String[] args) {
        BinarySerachTree tree = new BinarySerachTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);


        System.out.println("6 = " + tree.find(6));
        System.out.println("4 = " + tree.find(4));
        System.out.println("8= " + tree.find(8));
        System.out.println("3 = " + tree.find(3));
        System.out.println("40 = " + tree.find(40));
        System.out.println("50 = " + tree.find(50));
        System.out.println("100 = " + tree.find(100));

        tree.traverseDFS();

        tree.traverseBFS();

        printLeftOnlyEdgeNodesMain(tree);

    }

    private static void printLeftOnlyEdgeNodesMain(BinarySerachTree tree) {
        System.out.println("printLeftOnlyEdgeNodesMain");
        printLeftOnlyEdgeNodes(tree.getRoot());
    }

    private static void printLeftOnlyEdgeNodes(Node currentNode) {
        if (currentNode.left != null) {
            printLeftOnlyEdgeNodes(currentNode.left);
        }
        System.out.println("currentNode = " + currentNode);

    }
}

