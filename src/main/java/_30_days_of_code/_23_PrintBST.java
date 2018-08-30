package _30_days_of_code;

import _30_days_of_code._22_binary_search_tree.BinarySearchTree;
import _30_days_of_code._22_binary_search_tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class _23_PrintBST extends BinarySearchTree {
    public _23_PrintBST(int root) {
        super(root);
    }

    public void print() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);
        StringBuilder sb = new StringBuilder();
        while (nodeQueue.size() > 0) {
            Node oldestNode = nodeQueue.remove();
            sb.append(oldestNode.getValue() + " ");
            if (oldestNode.hasLeftTree())
                nodeQueue.add(oldestNode.getLeftTree());
            if (oldestNode.hasRightTree())
                nodeQueue.add(oldestNode.getRightTree());
        }
        String treeOutput = sb.toString().trim();
        System.out.println(treeOutput);
    }
}
