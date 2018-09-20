package datastructure.tree._2_Huffman;

import java.util.HashMap;
import java.util.Map;

/**
 * kawnayeen
 * 20/9/18
 */
abstract class Node implements Comparable<Node> {
    public int frequency; // the frequency of this tree
    public char data;
    public Node left, right;

    public Node(int freq) {
        frequency = freq;
    }

    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
}

class HuffmanLeaf extends Node {


    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}

class HuffmanNode extends Node {

    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}

public class _2_HuffmanDecoding {
    StringBuilder stringBuilder = new StringBuilder();
    private static final char GO_LEFT = '0';

    void decode(String s, Node root) {
        Node rootBackup = root;
        Node nextNode = root;
        for (char ch : s.toCharArray()) {
            if (ch == GO_LEFT)
                nextNode = nextNode.left;
            else
                nextNode = nextNode.right;
            if (nextNode instanceof HuffmanLeaf) {
                stringBuilder.append(nextNode.data);
                nextNode = root;
            }
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
