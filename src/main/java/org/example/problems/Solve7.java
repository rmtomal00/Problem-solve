package org.example.problems;

public class Solve7 {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(new Solution().reverse(-2147483415));
    }
    static  class Solution {
        public int reverse(int x) {
            boolean negative = false;
            if (x < 0) {
                negative = true;
                x = -1*x;
            }

            long result = 0;
            int remainder = x;
            while (remainder > 0) {
                result = result * 10 + remainder % 10;
                if (result > Integer.MAX_VALUE) {
                    return 0;
                }
                System.out.println(result);
                remainder = remainder / 10;

            }
            if (negative) {
                result = -result;
            }

            return (int) result;
        }
    }
}
