package com.learning.core_java_spring_lab.Day5;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache {
    public static void main(String[] args) {
        Map<Integer,Integer> cache = new LinkedHashMap<>(5, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > 4 ;
            }
        };
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(4,4);
        cache.put(5,5);
        cache.put(6,6);

        cache.get(3);
        cache.get(4);
        System.out.println(cache);

    }
}
