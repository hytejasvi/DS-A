package com.learning.core_java_spring_lab.Day5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>(List.of(1,2,3)); // throws  ConcurrentModificationException
        List<Integer> list = new CopyOnWriteArrayList<>(List.of(1,2,3));
        for (Integer i : list) {
            list.remove(i);
        }
        System.out.println("survived");
    }
}
