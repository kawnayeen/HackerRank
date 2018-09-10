package datastructure.clean.LinkedList.Singly;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {
    @Test
    public void testInstantiation() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
        Assert.assertNotNull(singlyLinkedList);
        Assert.assertEquals(5,singlyLinkedList.getHead().getData());
    }
}