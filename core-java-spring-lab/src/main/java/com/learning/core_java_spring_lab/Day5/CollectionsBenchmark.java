package com.learning.core_java_spring_lab.Day5;

import java.time.Instant;
import java.util.*;

public class CollectionsBenchmark {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        long beforeTime = System.nanoTime();
        for(int i=0;i < Math.pow(10, 6);i++) {
            list.add(i);
        }
        long afterTime = System.nanoTime();
        System.out.println("time difference for adding arraylist : "+(afterTime - beforeTime));

        long beforeRemovingTime = System.nanoTime();
        for(int i=0;i < list.size();i+=3) {
            list.remove(i);
        }
        long afterRemovingTime = System.nanoTime();
        System.out.println("time difference for removing arraylist : "+(afterRemovingTime - beforeRemovingTime));

        long beforeTime2 = System.nanoTime();
        for(int i=0;i < Math.pow(10, 6);i++) {
            ll.add(i);
        }
        long afterTime2 = System.nanoTime();
        System.out.println("time difference for ll : "+(afterTime2 - beforeTime2));

        long beforeRemovingTime2 = System.nanoTime();
        for(int i=0;i < ll.size();i+=3) {
            ll.remove(i);
        }
        long afterRemovingTime2 = System.nanoTime();
        System.out.println("time difference for removing from ll : "+(afterRemovingTime2 - beforeRemovingTime2));


        long beforeTime3 = System.nanoTime();
        for(int i=0;i < Math.pow(10, 6);i++) {
            s.add(i);
        }
        long afterTime3 = System.nanoTime();
        System.out.println("time difference for set : "+(afterTime3 - beforeTime3));
    }
}


/*
* time difference for adding arraylist : 34084200
time difference for removing arraylist : 12301208300
time difference for ll : 114739700
time difference for removing from ll : 289307970800
time difference for set : 102736200
* */