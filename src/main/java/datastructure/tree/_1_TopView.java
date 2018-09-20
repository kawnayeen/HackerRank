package datastructure.tree;

import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class NodeInfo {
    int data;
    int depth;

    public NodeInfo(int data, int depth) {
        this.data = data;
        this.depth = depth;
    }
}

public class _1_TopView {
    StringBuilder builder = new StringBuilder();
    Map<Integer, NodeInfo> nodeMap = new HashMap<>();

    void topView(Node root) {
        nodeMap.put(0, new NodeInfo(root.data, 0));
        processNode(root.left, -1, 1);
        processNode(root.right, 1, 1);
        Set<Integer> keySet = nodeMap.keySet();
        List<Integer> keys = new ArrayList<>();
        for (int x : keySet)
            keys.add(x);
        Collections.sort(keys);
        for (int key : keys) {
            builder.append(nodeMap.get(key).data);
            builder.append(" ");
        }
        System.out.println(builder.toString().trim());
    }

    void processNode(Node node, int distance, int depth) {
        if (node == null)
            return;
        if (!nodeMap.containsKey(distance) || nodeMap.get(distance).depth > depth) {
            nodeMap.put(distance, new NodeInfo(node.data, depth));
        }
        processNode(node.left, distance - 1, depth + 1);
        processNode(node.right, distance + 1, depth + 1);
    }

    Node lca(Node root, int v1, int v2) {
        Node nodeToCheck = root;
        do {
            if (nodeToCheck.data == v1 || nodeToCheck.data == v2)
                break;
            if (v1 < nodeToCheck.data && v2 >= nodeToCheck.data)
                break;
            if (v2 < nodeToCheck.data && v1 >= nodeToCheck.data)
                break;
            if (v1 < nodeToCheck.data)
                nodeToCheck = nodeToCheck.left;
            else
                nodeToCheck = nodeToCheck.right;
        } while (nodeToCheck != null);
        return nodeToCheck;
    }

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
