package DataStructuresAndAlgorithmPractice.LinkedListPractice;

public class FindingValue {

public boolean findvalue(Node head, int data) {

        Node current;

        current = head;

        while(current.next != null) {

            if(current.data == data ) {

                return true;
            }
            current = current.next;

        }
        if(current.next == null) {
            if(current.data==data) {

                return true;
            }
        }

        return false;

    }

 

}