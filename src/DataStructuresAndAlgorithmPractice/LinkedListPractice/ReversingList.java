package DataStructuresAndAlgorithmPractice.LinkedListPractice;

public class ReversingList {

    public Node reverse(Node head) {

        Node current = head;
        Node next = null;
        Node previous = null;

        while(current != null) {

            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

}