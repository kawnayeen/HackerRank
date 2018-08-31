package _30_days_of_code._22_binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    protected Node rootNode;

    public BinarySearchTree(int root) {
        rootNode = new Node(root);
    }

    public int getSize() {
        return rootNode.size();
    }

    public void addElement(int element) {
        Node node = new Node(element);
        Node leafToInsert = rootNode.getLeafToInsert(node);
        if (node.getValue() < leafToInsert.getValue()) {
            //System.out.println("Adding " + node.getValue() + " at left of " + leafToInsert.getValue());
            leafToInsert.setLeftTree(node);
        } else {
            //System.out.println("Adding " + node.getValue() + " at right of " + leafToInsert.getValue());
            leafToInsert.setRightTree(node);
        }
    }

    public int getDepth() {
        return rootNode.getTreeDepth();
    }

    public String getLevelOrder() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);
        StringBuilder sb = new StringBuilder();
        while (nodeQueue.size() > 0) {
            Node oldestNode = nodeQueue.remove();
            sb.append(oldestNode.getValue() + " ");
            if (oldestNode.hasLeftTree()) {
                nodeQueue.add(oldestNode.getLeftTree());
            }
            if (oldestNode.hasRightTree()) {
                nodeQueue.add(oldestNode.getRightTree());
            }
        }
        return sb.toString().trim();
    }
}
