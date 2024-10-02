package org.example.problems;

import java.util.Arrays;

public class Solve2 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] q = {{0,1},{1,2},{0,3},{3,3}};

        System.out.println(Arrays.toString(xorQueries(arr, q)));
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int arrL = 0;
        for (int[] q : queries) {
            int initValue = 0;
            if (q[1]- q[0] > 1) {
                for (int i = q[0]; i <= q[1]; i++) {
                    initValue ^= arr[i];
                }
            }else{
                if(q[0] == q[1]){
                    initValue ^= arr[q[0]];
                }else{
                    initValue ^= arr[q[0]];
                    initValue ^= arr[q[1]];
                }
            }
            result[arrL] = initValue;
            arrL++;
        }
        return result;
    }
}
