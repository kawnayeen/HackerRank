package datastructure.linkedlist;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/9/18
 */
public class _1_PrintLinkedListTest extends ConsoleOutputTest {
    @Test
    public void testPrint() {
        _1_PrintLinkedList.SinglyLinkedList linkedList = new _1_PrintLinkedList.SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);
        _1_PrintLinkedList printList = new _1_PrintLinkedList();
        printList.printLinkedList(linkedList.head);
        Assert.assertEquals("16\n13\n", outContent.toString());
    }

    @Test
    public void testReverseThenPrint() {
        _1_PrintLinkedList.SinglyLinkedList linkedList = new _1_PrintLinkedList.SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);
        linkedList.insertNode(19);
        _1_PrintLinkedList printList = new _1_PrintLinkedList();
        printList.printLinkedList(printList.reverse(linkedList.head));
        Assert.assertEquals("19\n13\n16\n", outContent.toString());
    }

    @Test
    public void testReversePrint() {
        _1_PrintLinkedList.SinglyLinkedList linkedList = new _1_PrintLinkedList.SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);
        _1_PrintLinkedList printList = new _1_PrintLinkedList();
        printList.reversePrint(linkedList.head);
        Assert.assertEquals("13\n16\n", outContent.toString());
    }

    @Test
    public void testDeleteNode() {
        _1_PrintLinkedList.SinglyLinkedList linkedList = new _1_PrintLinkedList.SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);
        linkedList.insertNode(34);
        linkedList.insertNode(31);
        _1_PrintLinkedList printList = new _1_PrintLinkedList();
        printList.deleteNode(linkedList.head, 2);
        printList.printLinkedList(linkedList.head);
        Assert.assertEquals("16\n13\n31\n", outContent.toString());
    }

    @Test
    public void testGetNodeFromTail() {
        _1_PrintLinkedList.SinglyLinkedList linkedList = new _1_PrintLinkedList.SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);
        linkedList.insertNode(34);
        linkedList.insertNode(31);
        _1_PrintLinkedList printList = new _1_PrintLinkedList();
        int val = printList.getNode(linkedList.head, 2);
        Assert.assertEquals(13, val);
        val = printList.getNode(linkedList.head, 3);
        Assert.assertEquals(16, val);
    }
}