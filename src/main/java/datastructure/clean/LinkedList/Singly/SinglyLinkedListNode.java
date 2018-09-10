package datastructure.clean.LinkedList.Singly;

public class SinglyLinkedListNode {
    private int data;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }
}
