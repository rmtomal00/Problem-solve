package org.example.problems;

import java.util.Arrays;

public class Solve1 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int[] ar = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(ar, target)));
        System.out.println(System.currentTimeMillis() - t);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        int g = 0;
        for(int a = 0; a < nums.length; a++){
            if(g == 1){
                break;
            }
            for(int b = 0; b < nums.length; b++){
                if (a != b ){
                    if(nums[a] + nums[b] == target){
                        array[0] = a;
                        array[1] = b;
                        g++;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
