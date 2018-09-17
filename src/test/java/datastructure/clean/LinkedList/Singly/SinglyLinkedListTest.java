package datastructure.clean.LinkedList.Singly;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {
    @Test
    public void testInstantiation() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
        Assert.assertNotNull(singlyLinkedList);
        Assert.assertEquals(5, singlyLinkedList.getHead().getData());
    }

    @Test
    public void testInsertNodeAtHead() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
        SinglyLinkedListNode nodeOne = new SinglyLinkedListNode(3);
        SinglyLinkedListNode nodeTwo = new SinglyLinkedListNode(7);
        singlyLinkedList.insertNodeAtHead(nodeOne);
        singlyLinkedList.insertNodeAtHead(nodeTwo);
        SinglyLinkedListNode head = singlyLinkedList.getHead();
        Assert.assertEquals(7, head.getData());
        Assert.assertEquals(3, head.getNext().getData());
        Assert.assertEquals(5, head.getNext().getNext().getData());
    }

    @Test
    public void testInsertNodeAtTail() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
        SinglyLinkedListNode nodeOne = new SinglyLinkedListNode(3);
        SinglyLinkedListNode nodeTwo = new SinglyLinkedListNode(7);
        singlyLinkedList.insertNodeAtTail(nodeOne);
        singlyLinkedList.insertNodeAtTail(nodeTwo);
        SinglyLinkedListNode head = singlyLinkedList.getHead();
        Assert.assertEquals(5, head.getData());
        Assert.assertEquals(3, head.getNext().getData());
        Assert.assertEquals(7, head.getNext().getNext().getData());
    }

    @Test
    public void testInsertNodeAtSpecificPositionFromHead() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
        SinglyLinkedListNode nodeOne = new SinglyLinkedListNode(3);
        SinglyLinkedListNode nodeTwo = new SinglyLinkedListNode(7);
        singlyLinkedList.insertNodeAtTail(nodeOne);
        singlyLinkedList.insertNodeAtTail(nodeTwo);
        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(9);
        singlyLinkedList.insertNodeFromHead(2, nodeToInsert);
        SinglyLinkedListNode head = singlyLinkedList.getHead();
        Assert.assertEquals(5, head.getData());
        Assert.assertEquals(3, head.getNext().getData());
        Assert.assertEquals(9, head.getNext().getNext().getData());
        Assert.assertEquals(7, head.getNext().getNext().getNext().getData());
    }
}