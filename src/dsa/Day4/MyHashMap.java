package dsa.Day4;

import java.util.Arrays;

public class MyHashMap {

    int[] myMap;
    public MyHashMap() {
        myMap = new int[1000001];
        Arrays.fill(myMap, -1);

    }

    public void put(int key, int value) {
        myMap[key] = value;
    }

    public int get(int key) {
        return myMap[key];
    }

    public void remove(int key) {
        myMap[key] = -1;
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1000000, 1);
        System.out.println(myHashMap.get(1000000));
        System.out.println(myHashMap.get(1));
    }
}
