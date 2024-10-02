package org.example.problems;

import java.util.HashMap;
import java.util.Map;

public class Solve8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("aacabdkacaa"));
    }
    static class Solution {
        public String longestPalindrome(String s) {
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (s.charAt(j) != s.charAt(i-j)) {
                        start = i;
                    }
                }

            }
            return null;
        }
    }

    /*class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            String longestPalindrome = "";
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (longestPalindrome.isEmpty()) {
                    longestPalindrome = String.valueOf(c);
                }
                if(!map.containsKey(c)) {
                    map.put(c, i);
                }else {
                    int start = map.get(c);
                    String sub = s.substring(start, i+1);
                    boolean isPalindrome = false;
                    for (int j = 0; j < sub.length()/2; j++) {
                        if (sub.charAt(j) != c) {
                            map.put(c, i);
                        }
                        if (sub.charAt(j) != sub.charAt(sub.length()-1 - j)) {
                            map.put(c, i);
                            isPalindrome = false;
                            break;
                        }else {
                            isPalindrome = true;
                        }
                    }
                    if(isPalindrome) {
                        if (longestPalindrome.length() < sub.length()) {
                            longestPalindrome = sub;
                        }
                    }
                }
            }

            return longestPalindrome;
        }
    }*/
}
