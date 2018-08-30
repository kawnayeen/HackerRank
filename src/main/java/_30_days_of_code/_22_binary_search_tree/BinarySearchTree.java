package _30_days_of_code._22_binary_search_tree;

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
        if (node.getValue() < leafToInsert.getValue())
            leafToInsert.setLeftTree(node);
        else
            leafToInsert.setRightTree(node);
    }

    public int getDepth(){
        return rootNode.getTreeDepth();
    }
}
