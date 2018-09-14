package datastructure.clean.LinkedList.Singly;

public class SinglyLinkedList {
    private SinglyLinkedListNode head;

    public SinglyLinkedList(int initData) {
        head = new SinglyLinkedListNode(initData);
    }

    public SinglyLinkedListNode getHead() {
        return head;
    }

    public void insertNodeAtHead(SinglyLinkedListNode node) {
        node.setNext(head);
        head = node;
    }

    public void insertNodeAtTail(SinglyLinkedListNode node) {
        SinglyLinkedListNode adjacentNode = head;
        while (adjacentNode.getNext() != null)
            adjacentNode = adjacentNode.getNext();
        adjacentNode.setNext(node);
    }
}
