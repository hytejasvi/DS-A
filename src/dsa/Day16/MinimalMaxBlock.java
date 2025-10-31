package dsa.Day16;

import java.util.*;

public class MinimalMaxBlock {

    public static int minimalMaxBlockBruteforce(List<Integer> list) {
        int minMaxBlockSize = Integer.MAX_VALUE;
        int minNum = -1;

        Set<Integer> uniqueElements = new HashSet<>(list);

        for (int num : uniqueElements) {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < list.size(); ++i) {
                if (list.get(i) == num) {
                    indices.add(i);
                }
            }
            indices.add(0, -1);
            indices.add(list.size());

            int maxBlockSize = 0;
            for (int i = 1; i < indices.size(); ++i) {
                maxBlockSize = Math.max(maxBlockSize, indices.get(i) - indices.get(i - 1) - 1);
            }

            if (maxBlockSize < minMaxBlockSize) {
                minMaxBlockSize = maxBlockSize;
                minNum = num;
            }
        }

        return minNum;
    }

    public static int minimalMaxBlock(List<Integer> list) {
        HashMap<Integer, Integer> lastOccurrence = new HashMap<>();
        HashMap<Integer, Integer> maxBlockSizes = new HashMap<>();

        for (int i = 0; i < list.size(); ++i) {
            int num = list.get(i);
            if (!lastOccurrence.containsKey(num)) {
                maxBlockSizes.put(num, i);
            } else {
                int blockSize = i - lastOccurrence.get(num) - 1;
                maxBlockSizes.put(num, Math.max(maxBlockSizes.get(num), blockSize));
            }
            lastOccurrence.put(num, i);
        }

        for (Map.Entry<Integer, Integer> entry : lastOccurrence.entrySet()) {
            int num = entry.getKey();
            int pos = entry.getValue();
            int blockSize = list.size() - pos - 1;
            maxBlockSizes.put(num, Math.max(maxBlockSizes.get(num), blockSize));
        }

        int minNum = -1;
        int minBlockSize = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : maxBlockSizes.entrySet()) {
            if (entry.getValue() < minBlockSize) {
                minBlockSize = entry.getValue();
                minNum = entry.getKey();
            }
        }

        return minNum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 4, 4, 4, 1, 2, 5);

        // Timing brute force method
        long startTimeBruteForce = System.nanoTime();
        int bruteForceResult = minimalMaxBlockBruteforce(list);
        long endTimeBruteForce = System.nanoTime();
        long durationBruteForce = endTimeBruteForce - startTimeBruteForce;

        // Timing optimized method
        long startTimeOptimized = System.nanoTime();
        int optimizedResult = minimalMaxBlock(list);
        long endTimeOptimized = System.nanoTime();
        long durationOptimized = endTimeOptimized - startTimeOptimized;

        // Output results
        System.out.println("Brute Force Result: " + bruteForceResult);
        System.out.println("Brute Force Time: " + durationBruteForce + " nanoseconds");

        System.out.println("Optimized Result: " + optimizedResult);
        System.out.println("Optimized Time: " + durationOptimized + " nanoseconds");
    }
}