package org.example.problems;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solve5 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        String sp = "pwwkew";
        String y = "abcdadefghe";
        String z = "d232vdf";
        String q = "efgehijkl";
        String n = "klmaoknpqrstuz12575ao";
        String a =  "anviaj";
        System.out.println(new Solution().lengthOfLongestSubstring(s));
    }

    public static  class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }
            int maxLength = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = s.length()-1; i > 0; i--) {
                char c = s.charAt(i);

                if (s.contains(String.valueOf(c))) {
                    int lastIndex = s.lastIndexOf(String.valueOf(c));

                    if(!list.contains(lastIndex)){
                        if (list.isEmpty()){
                            list.add(lastIndex);
                            maxLength++;
                        }else if (list.getLast() -1 == lastIndex){
                            list.add(lastIndex);
                            maxLength++;
                        }
                        /*list.add(lastIndex);
                        maxLength++;*/
                    }
                    System.out.printf("%s,%d\n", c, lastIndex);
                }
            }


            return maxLength;
        }
    }
}
