package datastructure.linkedlist;

/**
 * kawnayeen
 * 5/9/18
 */
public class _2_InsertNodeAtTail {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null)
            return new SinglyLinkedListNode(data);
        SinglyLinkedListNode nodeToLink = head;
        while (nodeToLink.next != null)
            nodeToLink = nodeToLink.next;
        nodeToLink.next = new SinglyLinkedListNode(data);
        return head;
    }
}
