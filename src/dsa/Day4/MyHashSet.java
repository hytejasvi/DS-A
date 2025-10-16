package dsa.Day4;

public class MyHashSet {

    private final boolean[] mySet;
    public MyHashSet() {
        mySet = new boolean[1000002];
    }

    public void add(int key) {
        mySet[key+1] = true;
    }

    public void remove(int key) {
        mySet[key+1] = false;
    }

    public boolean contains(int key) {
        return mySet[key+1];
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(1);
        System.out.println(myHashSet.contains(2));
        System.out.println(myHashSet.contains(1));
    }
}
