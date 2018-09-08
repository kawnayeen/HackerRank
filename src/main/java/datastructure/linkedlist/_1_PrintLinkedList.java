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

    SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null)
            return head;
        SinglyLinkedListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null)
            return true;
        boolean isEqual = true;
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                isEqual = false;
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if (isEqual) {
            if (head1 != null || head2 != null)
                isEqual = false;
        }
        return isEqual;
    }

    SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null)
            return null;
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        SinglyLinkedListNode newHead, residentNode, immigrantNode;

        if (head1.data < head2.data) {
            residentNode = head1;
            newHead = head1;
            immigrantNode = head2;
        } else {
            residentNode = head2;
            newHead = head2;
            immigrantNode = head1;
        }

        while (residentNode.next != null && immigrantNode != null) {
            if (residentNode.next.data < immigrantNode.data) {
                residentNode = residentNode.next;
            } else {
                SinglyLinkedListNode tempNode = immigrantNode;
                immigrantNode = immigrantNode.next;
                tempNode.next = residentNode.next;
                residentNode.next = tempNode;
            }
        }
        if (immigrantNode != null)
            residentNode.next = immigrantNode;
        return newHead;
    }

    int positionCount = 0;

    int getNode(SinglyLinkedListNode head, int positionFromTail) {
        if (head.next == null) {
            positionCount = 0;
            return head.data;
        }
        int valFromRemaining = getNode(head.next, positionFromTail);
        if (positionCount < positionFromTail) {
            positionCount++;
            return head.data;
        } else {
            return valFromRemaining;
        }
    }

    SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null || head.next == null)
            return head;
        SinglyLinkedListNode nextNode = head;
        while (nextNode.next != null) {
            if (nextNode.data == nextNode.next.data) {
                nextNode.next = nextNode.next.next;
            } else {
                nextNode = nextNode.next;
            }
        }
        return head;
    }

    boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null)
            return false;
        SinglyLinkedListNode fast = head.next;
        SinglyLinkedListNode slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null)
            return newNode;
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }
        int currentPosition = 0;
        SinglyLinkedListNode currentNode = head;
        boolean inserted = false;
        while (currentNode.next != null) {
            if (currentPosition + 1 == position) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                inserted = true;
                break;
            }
            currentNode = currentNode.next;
            currentPosition++;
        }
        if (!inserted) {
            currentNode.next = newNode;
        }
        return head;
    }

    int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode backupHead2 = head2;
        while (head1 != null) {
            while (head2 != null) {
                if (head1 == head2)
                    return head1.data;
                head2 = head2.next;
            }
            head1 = head1.next;
            head2 = backupHead2;
        }
        return 0;
    }
}
