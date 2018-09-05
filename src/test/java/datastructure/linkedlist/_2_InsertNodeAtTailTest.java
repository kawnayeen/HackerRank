package datastructure.linkedlist;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/9/18
 */
public class _2_InsertNodeAtTailTest extends ConsoleOutputTest {
    @Test
    public void testInsertion() {
        _2_InsertNodeAtTail insertNodeAtTail = new _2_InsertNodeAtTail();
        _2_InsertNodeAtTail.SinglyLinkedList linkedList = new _2_InsertNodeAtTail.SinglyLinkedList();
        _2_InsertNodeAtTail.SinglyLinkedListNode head = insertNodeAtTail.insertNodeAtTail(linkedList.head, 141);
        linkedList.head = head;
        insertNodeAtTail.insertNodeAtTail(linkedList.head, 302);
        insertNodeAtTail.insertNodeAtTail(linkedList.head, 164);
        insertNodeAtTail.printLinkedList(head);
        Assert.assertEquals("141\n302\n164\n", outContent.toString());
    }
}