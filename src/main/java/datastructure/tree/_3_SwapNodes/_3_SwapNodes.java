package datastructure.tree._3_SwapNodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    int leftTreeIndex;
    int rightTreeIndex;
    int depth;

    public Node(int data, int leftTreeIndex, int rightTreeIndex, int depth) {
        this.data = data;
        this.leftTreeIndex = leftTreeIndex;
        this.rightTreeIndex = rightTreeIndex;
        this.depth = depth;
    }
}

public class _3_SwapNodes {
    List<Node> tree;
    List<Integer> swappedValues;

    int[][] swapNodes(int[][] indexes, int[] queries) {
        /*
         * Write your code here.
         */
        tree = new ArrayList<>();
        Node root = new Node(1, -1, -1, 1);
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        tree.add(root);
        for (int i = 0; i < indexes.length; i++) {
            Node parentNode = nodeQueue.remove();
            int depthOfChild = parentNode.depth + 1;
            Node leftChild = new Node(indexes[i][0], -1, -1, depthOfChild);
            tree.add(leftChild);
            parentNode.leftTreeIndex = tree.size() - 1;
            if (leftChild.data != -1)
                nodeQueue.add(leftChild);
            Node rightChild = new Node(indexes[i][1], -1, -1, depthOfChild);
            tree.add(rightChild);
            parentNode.rightTreeIndex = tree.size() - 1;
            if (rightChild.data != -1)
                nodeQueue.add(rightChild);
        }
        int[][] output = new int[queries.length][];
        for (int i = 0; i < queries.length; i++) {
            swap(queries[i]);
            swappedValues = new ArrayList<>();
            inOrder(root);
            output[i] = swappedValues.stream().mapToInt(Integer::intValue).toArray();
        }
        return output;
    }

    void swap(int depth) {
        for (int i = 0; i < tree.size(); i++) {
            Node node = tree.get(i);
            if (node.data != -1 && node.depth % depth == 0) {
                int temp = node.leftTreeIndex;
                node.leftTreeIndex = node.rightTreeIndex;
                node.rightTreeIndex = temp;
            }
        }
    }

    void inOrder(Node node) {
        if (node.leftTreeIndex != -1)
            inOrder(tree.get(node.leftTreeIndex));
        if (node.data != -1)
            swappedValues.add(node.data);
        if (node.rightTreeIndex != -1)
            inOrder(tree.get(node.rightTreeIndex));
    }
}
