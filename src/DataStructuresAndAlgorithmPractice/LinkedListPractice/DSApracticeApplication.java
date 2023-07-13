package DataStructuresAndAlgorithmPractice.LinkedListPractice;

import java.util.LinkedList;

public class DSApracticeApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedListClass l = new LinkedListClass();
        FindingValue find = new FindingValue();
        ReversingList r = new ReversingList();
        
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);        
        l.insert(7);
        l.insert(8);
        l.insert(9);

        l.show(l.head);

        System.out.println();
        System.out.print(" after reversing ");
//        l.insertAt(2, 5);
//        l.show(l.head);
//        System.out.println();
//        
//        System.out.println(find.findvalue(l.head, 6));

        l.show(r.reverse(l.head));


    }

 

    }