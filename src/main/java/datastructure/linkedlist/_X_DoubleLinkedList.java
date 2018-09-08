package datastructure.linkedlist;

public class _X_DoubleLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if (head == null)
            return new DoublyLinkedListNode(data);
        DoublyLinkedListNode nextNode = head;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        while (nextNode != null) {
            if (nextNode.data < data) {
                if (nextNode.next == null) {
                    nextNode.next = newNode;
                    newNode.prev = nextNode;
                    break;
                } else
                    nextNode = nextNode.next;
            } else {
                newNode.next = nextNode;
                newNode.prev = nextNode.prev;
                if (nextNode.prev != null) {
                    nextNode.prev.next = newNode;
                } else {
                    nextNode.prev = newNode;
                    head = newNode;
                }
                break;
            }
        }
        return head;
    }
}
