package datastructure.clean.LinkedList.Singly;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListNodeTest {
    @Test
    public void testInstantiation() {
        SinglyLinkedListNode node = new SinglyLinkedListNode(5);
        Assert.assertNotNull(node);
        Assert.assertEquals(5, node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void testNextReference(){
        SinglyLinkedListNode firstNode = new SinglyLinkedListNode(5);
        SinglyLinkedListNode secondNode = new SinglyLinkedListNode(3);
        firstNode.setNext(secondNode);
        Assert.assertEquals(3,firstNode.getNext().getData());
    }
}