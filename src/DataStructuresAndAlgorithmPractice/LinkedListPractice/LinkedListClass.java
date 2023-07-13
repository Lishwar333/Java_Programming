package DataStructuresAndAlgorithmPractice.LinkedListPractice;

public class LinkedListClass {

	Node head;

    public void insert(int data){

        Node n = new Node();

        n.data = data;
        n.next = null;

        if( head == null) {

            head = n;
        }
        else {

            Node node = head;

            while(node.next != null) {

                node = node.next;

            }

            node.next = n;
            node = null;
        }

    }

    public void show(Node head) {

        Node n = head;

        while(n.next != null) {

            System.out.print(n.data);
            n = n.next;
        }
        System.out.print(n.data);
        n = null;
    }

    public void insertAt(int at, int data) {

        Node n = head;
        Node node = new Node();
        node.data = data;
        node.next = null;

        for(int i=1; i<at; i++) {

            n = n.next;
        }

        node.next = n.next;
        n.next = node;

        n = null;
        node = null;

    }

 

}