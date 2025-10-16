package dsa.Day4;

public class LRUCache {
/* Idea:
* use hashmap + linkedlist
* hashmap to store the key, and in value store the LL address for that key
* in LL store teh value
* so the get will be O(1) as we search with key adn we search in the map
* for put we will always insert at the head and hence it will be o(1)
* when the size limit is reached, we remove the tail element as it will be least recently used
* when a element is used (get or put),--> for get, remove from current place and add it at the head*/
    /*public LRUCache(int capacity) {

    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {

    }*/
}
