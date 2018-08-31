package _30_days_of_code._22_binary_search_tree;

public class Node {
    private int value;
    private Node leftTree;
    private Node rightTree;

    public Node(int value) {
        this.value = value;
        leftTree = null;
        rightTree = null;
    }

    public int size() {
        int leftSize = hasLeftTree() ? leftTree.size() : 0;
        int rightSize = hasRightTree() ? rightTree.size() : 0;
        return (1 + leftSize + rightSize);
    }

    public int getValue() {
        return value;
    }

    public void setLeftTree(Node leftTree) {
        this.leftTree = leftTree;
    }

    public void setRightTree(Node rightTree) {
        this.rightTree = rightTree;
    }

    public Node getLeafToInsert(Node nodeToInsert) {
        if (nodeToInsert.getValue() < value) {
            if (hasLeftTree())
                return leftTree.getLeafToInsert(nodeToInsert);
            return this;
        } else {
            if (hasRightTree())
                return rightTree.getLeafToInsert(nodeToInsert);
            return this;
        }
    }

    public boolean hasLeftTree() {
        return leftTree != null;
    }

    public boolean hasRightTree() {
        return rightTree != null;
    }

    public Node getLeftTree() {
        return leftTree;
    }

    public Node getRightTree() {
        return rightTree;
    }

    public int getTreeDepth() {
        int leftTreeDepth = hasLeftTree() ? leftTree.getTreeDepth() : 0;
        int rightTreeDepth = hasRightTree() ? rightTree.getTreeDepth() : 0;
        return 1 + (leftTreeDepth > rightTreeDepth ? leftTreeDepth : rightTreeDepth);
    }
}
