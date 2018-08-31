package _30_days_of_code._22_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void simpleTest() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(12);
        binarySearchTree.addElement(8);
        binarySearchTree.addElement(16);
        binarySearchTree.addElement(9);
        Assert.assertEquals(4, binarySearchTree.getSize());
        Assert.assertEquals(3, binarySearchTree.getDepth());
        binarySearchTree.addElement(14);
        Assert.assertEquals(3, binarySearchTree.getDepth());
        binarySearchTree.addElement(10);
        Assert.assertEquals(4, binarySearchTree.getDepth());
    }

    @Test
    public void testLevelOrder() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(3);
        binarySearchTree.addElement(5);
        binarySearchTree.addElement(4);
        binarySearchTree.addElement(7);
        binarySearchTree.addElement(2);
        binarySearchTree.addElement(1);
    }
}