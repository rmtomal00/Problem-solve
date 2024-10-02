package org.example.problems;

import java.lang.reflect.Array;
import java.util.*;

public class Solve3 {

    public static void main(String[] args) {
        /*String s = "catsanddog";
        List<String> wordDict = List.of(new String[]{"cat", "cats", "and", "sand", "dog"});*/
        String s = "pineapplepenapple";
        List<String> wordDict = List.of(new String[]{"apple","pen","applepen","pine","pineapple"});

       /* String s = "catsandog";
        List<String> wordDict = List.of(new String[]{"cats","dog","sand","and","cat"});*/

        /*String s = "a";
        List<String> wordDict = List.of(new String[]{"a"});*/

        /*String s = "a";
        List<String> wordDict = List.of(new String[]{"b"});*/

        /*String s = "bb";
        List<String> wordDict = List.of(new String[]{"a","b","bbb","bbbb"});*/

        /*String s = "abcd";
        List<String> wordDict = List.of(new String[]{"a","abc","b","cd"});*/




        System.out.println(wordBreak(s, wordDict));
    }
    public static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<Integer, List<String>> memo = new HashMap<>();

        return dfs(s, 0, wordSet, memo);
    }

    private static List<String> dfs(String s, int start, Set<String> wordSet, Map<Integer, List<String>> memo) {
        if (memo.containsKey(start)) {
            return memo.get(start);
        }

        List<String> sentences = new ArrayList<>();

        if (start == s.length()) {
            sentences.add("");
            return sentences;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordSet.contains(word)) {
                List<String> subSentences = dfs(s, end, wordSet, memo);
                System.out.println(subSentences);
                for (String subSentence : subSentences) {
                    sentences.add(word + (subSentence.isEmpty() ? "" : " ") + subSentence);
                }
            }
        }

        memo.put(start, sentences);
        return sentences;
    }
}
