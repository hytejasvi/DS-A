package dsa.Day4;

/* Idea:
* use hashmap + linkedlist
* hashmap to store the key, and in value store the LL address for that key
* in LL store teh value
* so the get will be O(1) as we search with key adn we search in the map
* for put we will always insert at the head and hence it will be o(1)
* when the size limit is reached, we remove the tail element as it will be least recently used
* when a element is used (get or put),--> for get, remove from current place and add it at the head
* */

import java.util.*;

public class LRUCache {

    int capacity;

    DoublyLinkedList<Integer, Integer> ll = new DoublyLinkedList<>();
    Map<Integer, DoublyLinkedList.Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        DoublyLinkedList.Node n = map.get(key);
        ll.moveToHead(n);
        return (int) n.value;
    }

    public void add(int key, int value) {
        if (map.containsKey(key)) {                       // update existing
            DoublyLinkedList.Node old = map.get(key);
            ll.removeNode(old);
        } else if (ll.getSize() == capacity) {            // evict LRU
            DoublyLinkedList.Node lru = ll.removeLast();
            map.remove(lru.key);                          // use key, not value
        }
        DoublyLinkedList.Node n = ll.addFirst(key, value);
        map.put(key, n);
    }

    public void displayElements() {
        DoublyLinkedList.Node curr = ll.head;
        while (curr != null) {
            System.out.print(curr.key + ":" + curr.value + " ");
            System.out.println();
            curr = curr.next;
        }
        System.out.println();
    }
}
