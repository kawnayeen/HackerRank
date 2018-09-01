package _30_days_of_code._24_linked_list;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;

    public LinkedList(int startingValue) {
        head = new Node(startingValue);
    }

    public void addElement(int element) {
        Node newNode = new Node(element);
        Node nodeToInsert = head;
        while (nodeToInsert.getNext() != null) {
            nodeToInsert = nodeToInsert.getNext();
        }
        nodeToInsert.setNext(newNode);
    }

    public void removeDuplicate() {
        List<Integer> existingValues = new ArrayList<>();
        Node previousNode = head;
        existingValues.add(head.getData());
        Node nextNode = head.getNext();
        while (nextNode != null) {
            if (existingValues.contains(nextNode.getData())) {
                previousNode.setNext(nextNode.getNext());
                nextNode = nextNode.getNext();
            } else {
                existingValues.add(nextNode.getData());
                previousNode = nextNode;
                nextNode = nextNode.getNext();
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNodeToPrint = head;
        do {
            stringBuilder.append(nextNodeToPrint.getData() + " ");
            nextNodeToPrint = nextNodeToPrint.getNext();
        } while (nextNodeToPrint != null);
        return stringBuilder.toString().trim();
    }
}
