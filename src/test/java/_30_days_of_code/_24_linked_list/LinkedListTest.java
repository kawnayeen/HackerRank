package _30_days_of_code._24_linked_list;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testLinkedList() {
        LinkedList linkedList = new LinkedList(1);
        linkedList.addElement(2);
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(3);
        linkedList.addElement(4);
        Assert.assertEquals("1 2 2 3 3 4", linkedList.toString());
        linkedList.removeDuplicate();
        Assert.assertEquals("1 2 3 4", linkedList.toString());
    }
}