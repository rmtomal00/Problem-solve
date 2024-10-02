package org.example.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Abrakedabra {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();*/

        //abrakedabra
        String str = "abrakedabrakedabra";

        String longestSubstring = findLongestSubstring(str);

        if (!longestSubstring.isEmpty()) {
            System.out.println("Longest matching substring: " + longestSubstring);
        } else {
            System.out.println("No matching substring found.");
        }

        //System.out.println(arrayList);
    }

    private static String findLongestSubstring(String str) {
        int n = str.length();
        String longestSubstring = "";

        // Try every possible starting index and length of substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String currentSubstr = str.substring(i, j);
                System.out.println(str.indexOf(currentSubstr));
                System.out.println(str.lastIndexOf(currentSubstr));
                // Check if the substring occurs more than once in the string
                if (str.indexOf(currentSubstr) != str.lastIndexOf(currentSubstr)) {
                    if (currentSubstr.length() > longestSubstring.length()) {
                        longestSubstring = currentSubstr;
                    }
                }
            }
        }
        return longestSubstring;
    }

}
