package org.example.problems;

import java.util.Collections;

public class Solve6 {
    public static void main(String[] args) {
        System.out.printf("isPalindrome: %b", new Solution().isPalindrome(12121));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            if (x == 0) {
                return true;
            }
            String s = Integer.toString(x);

            for (int i = 0; i < s.length() / 2; i++) {
                System.out.println(s.length() - 1 - i);
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }

            return true;
        }
    }
}
