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

    public void insertNodeFromHead(int positionAt, SinglyLinkedListNode node) {
        int pos = 1;
        SinglyLinkedListNode adjacentNode = head;
        while (adjacentNode.getNext() != null) {
            adjacentNode = adjacentNode.getNext();
            pos++;
            if (pos == positionAt)
                break;
        }
        if (positionAt == pos) {
            node.setNext(adjacentNode.getNext());
            adjacentNode.setNext(node);
        } else
            System.err.println("Invalid position to insert from head");
    }

    public void insertNodeFromTail(int positionAt, SinglyLinkedListNode node) {

    }
}
