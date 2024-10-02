package org.example;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] duplicate = new int[100];

        for (int i = 0; i < duplicate.length; i++) {
            duplicate[i] = getRandomNumber(0, 50);
        }
        System.out.println("Input done");
        long startTime = System.currentTimeMillis();
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < duplicate.length; i++) {
            if (!set.add(duplicate[i])) {
                duplicateSet.add(duplicate[i]);
                count++;
            }
        }
        Arrays.sort(duplicate);
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(Arrays.toString(duplicate));
        var list = Arrays.asList(duplicate);
        Collections.reverse(list);
        System.out.println(String.format("Total Duplicate: %d Total unique: %d", set.size(), duplicate.length - count));

    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
