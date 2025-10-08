package ll;

import java.util.Iterator;

public class LL<T> {
    private Node head;
    private Node tail;

    private int size;

    LL() {
        this.size = 0;
    }
    public int size() {
        return size;
    }

    public void addFirst(T value) {
        Node<T> n = new Node(value);
        n.next = head;
        head = n;
        if(tail == null) {
            tail = n;
        }
        size++;
    }

    public void addLast(T value) {
        Node<T> n = new Node<>(value);
        if (tail == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        size++;
    }

    public void deleteFirst() {
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    public void deleteLast() {
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    public boolean exists(T value) {
        Node temp = head;
        while(temp != null) {
            if(temp.value.equals(value)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void insertAtIndex(int index, T value) {
        if(index < 0) {
            System.out.println("Invalid index entered");
            return;
        }
        if(index == 0) {
            addFirst(value);
        } else if(index == size() || index > size()) {
            addLast(value);
        } else {
            int counter = 0;
            Node<T> n = new Node(value);
            Node temp = head;
            while(temp != null && counter < index-1) {
                temp = temp.next;
                counter++;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public void deleteElement(T value) {
        Node temp = head;
        Node left = head;
        while(temp != null && temp.value != value) {
            left = temp;
            temp = temp.next;
        }
        if(temp != null) {
            if(temp == head) {
                deleteFirst();
            } else if(temp.next == null) {
                deleteLast();
            } else {
                left.next = temp.next;
                temp.next = null;
                size--;
            }
        }
    }

    public boolean isEmpty() {
        return size() <= 0;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    private static class Node<T> {
         T value;
        private Node next;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
