package ll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LL<Integer> l1 = new LL<>();
        l1.addFirst(10);
        l1.addLast(20);
        l1.addLast(30);
        System.out.println(l1.size());
        l1.display();
        /*l1.deleteLast();
        l1.deleteFirst();
        System.out.println(l1.size());
        l1.display();
        System.out.println(l1.exists(50));*/
        l1.insertAtIndex(1,15);
        l1.insertAtIndex(0,5);
        l1.insertAtIndex(5,40);
        l1.insertAtIndex(8,80);
        System.out.println(l1.size());
        l1.display();
        System.out.println(l1.isEmpty());
        l1.deleteElement(20);
        l1.display();
    }
}
