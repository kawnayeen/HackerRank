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
        // set head as the next node of new node and update head reference
        node.setNext(head);
        head = node;
    }

    public void insertNodeAtTail(SinglyLinkedListNode node) {
        SinglyLinkedListNode adjacentNode = head;
        // go to tail node
        while (adjacentNode.getNext() != null)
            adjacentNode = adjacentNode.getNext();
        // set the new node as next node of tail
        adjacentNode.setNext(node);
    }

    public void insertNodeFromHead(int positionAt, SinglyLinkedListNode node) {
        // if position 0, then new node will be new head
        if (positionAt == 0) {
            node.setNext(head);
            head = node;
            return;
        }

        // while pointing at head, we are setting position at 1
        // that means pos is actually the position of next node of adjacent node
        int pos = 1;
        SinglyLinkedListNode adjacentNode = head;

        // proceed to node whose next node will be our new node
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

    public String printLinkedList() {
        StringBuilder builder = new StringBuilder();
        SinglyLinkedListNode startingNode = head;
        while (startingNode != null) {
            builder.append(startingNode.getData());
            builder.append(SPACE);
            startingNode = startingNode.getNext();
        }
        return builder.toString().trim();
    }

    private static final String SPACE = " ";
    private static final int SEARCH_ENDED = -1;
    private static final int TAIL_DISTANCE_FROM_TAIL = 0;

    public void insertNodeFromTail(int positionAt, SinglyLinkedListNode node) {
        insertFromTail(head, node, positionAt);
    }

    private int insertFromTail(SinglyLinkedListNode nodeToCheck, SinglyLinkedListNode nodeToInsert, int insertPos) {
        if (nodeToCheck.getNext() == null) {
            if (TAIL_DISTANCE_FROM_TAIL == insertPos) {
                nodeToCheck.setNext(nodeToInsert);
                return SEARCH_ENDED;
            }
            return TAIL_DISTANCE_FROM_TAIL;
        }
        int previousDistance = insertFromTail(nodeToCheck.getNext(), nodeToInsert, insertPos);
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
