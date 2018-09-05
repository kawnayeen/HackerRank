package datastructure.linkedlist;

/**
 * kawnayeen
 * 5/9/18
 */
public class _1_PrintLinkedList {
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
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (position == 0)
            return head.next;
        SinglyLinkedListNode previousNode = head;
        SinglyLinkedListNode nodeToDelete = head.next;
        for (int i = 1; i < position; i++) {
            previousNode = nodeToDelete;
            nodeToDelete = nodeToDelete.next;
        }
        previousNode.next = nodeToDelete.next;
        return head;
    }

    void reversePrint(SinglyLinkedListNode head) {
        if (head == null)
            return;
        reversePrint(head.next);
        System.out.println(head.data);
    }
}
