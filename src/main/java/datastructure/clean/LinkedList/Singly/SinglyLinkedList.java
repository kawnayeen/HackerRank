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
        if (positionAt == 0) {
            node.setNext(head);
            head = node;
            return;
        }
        int pos = 1;
        SinglyLinkedListNode adjacentNode = head;

        do {
            if (pos == positionAt)
                break;
            adjacentNode = adjacentNode.getNext();
            pos++;
        } while (adjacentNode.getNext() != null);

        if (positionAt == pos) {
            node.setNext(adjacentNode.getNext());
            adjacentNode.setNext(node);
        } else
            System.err.println("Invalid position to insert from head");
    }

    private static final int SEARCH_ENDED = -1;
    private static final int TAIL_DISTANCE_FROM_TAIL = 0;

    public void insertNodeFromTail(int positionAt, SinglyLinkedListNode node) {
        getPositionFromTail(head, node, positionAt);
    }

    private int getPositionFromTail(SinglyLinkedListNode nodeToCheck, SinglyLinkedListNode nodeToInsert, int insertPos) {
        if (nodeToCheck.getNext() == null) {
            if (TAIL_DISTANCE_FROM_TAIL == insertPos) {
                nodeToCheck.setNext(nodeToInsert);
                return SEARCH_ENDED;
            }
            return TAIL_DISTANCE_FROM_TAIL;
        }
        int previousDistance = getPositionFromTail(nodeToCheck.getNext(), nodeToInsert, insertPos);
        if (previousDistance == SEARCH_ENDED)
            return SEARCH_ENDED;
        previousDistance = previousDistance + 1;
        if (previousDistance == insertPos) {
            nodeToInsert.setNext(nodeToCheck.getNext());
            nodeToCheck.setNext(nodeToInsert);
            return SEARCH_ENDED;
        }
        return previousDistance;
    }
}
