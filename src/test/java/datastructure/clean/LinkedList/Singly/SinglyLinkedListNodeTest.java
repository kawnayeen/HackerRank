package datastructure.clean.LinkedList.Singly;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListNodeTest {
    @Test
    public void testInstantiation() {
        SinglyLinkedListNode node = new SinglyLinkedListNode(5);
        Assert.assertNotNull(node);
        Assert.assertEquals(5, node.data);
        Assert.assertNull(node.next);
    }
}