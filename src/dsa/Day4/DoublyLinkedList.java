package dsa.Day4;

public class DoublyLinkedList<K,V> {

    private int size;

    Node head;
    Node tail;
    private Node next;
    private Node previous;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public V getValue(Node n) {
        return (V) n.value;
    }

    public void removeNode(Node n) {
        if(n == tail) {
            removeLast();
        } else if(n == head){
            removeFirst();
        } else {
            n.previous.next = n.next;
            n.next.previous = n.previous;
            n.previous = null;
            n.next=null;
        }
        size--;
    }

    public void removeFirst() {
        if(head == null) {
            return;
        } else if(head == tail) {
            removeLast();
        } else {
            Node temp = head;
            head = head.next;
            head.previous = null;
            temp.next = null;
        }
        size--;
    }

    public void moveToHead(Node n) {
        // unlink the node (without decrementing size)
        if (n == head) return;
        if (n == tail) {
            tail = tail.previous;
            tail.next = null;
        } else {
            n.previous.next = n.next;
            n.next.previous = n.previous;
        }

        // now move to head
        n.next = head;
        head.previous = n;
        n.previous = null;
        head = n;
    }

    public Node addFirst(K key, V value) {
        Node n = new Node<>(key, value);
        n.next = head;

        if(head != null) {
            head.previous = n;
        }
        if(tail == null) {
            tail = n;
        }
        head = n;
        size++;
        return n;
    }

    public Node removeLast() {
        if(tail == null) {
            return null;
        }
        if(tail == head) {
            Node temp = tail;
            tail = null;
            head = null;
            size--;
            return temp;
        }

        tail.previous.next = null;
        Node temp = tail;
        tail = tail.previous;
        tail.next = null;
        temp.previous = null;
        size--;
        return temp;
    }

    public int getLastKey() {
        if(tail != null) {
            return (int) tail.key;
        } else {
            return -1;
        }
    }


    static class Node<K,V> {
        K key;
        V value;
        Node head;
        Node tail;
        protected Node next;
        private Node previous;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
}
