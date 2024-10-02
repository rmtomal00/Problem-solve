package org.example.problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        String g = new Scanner(System.in).next();
        String z = new Scanner(System.in).next();
        System.out.println(isMatch(g, z));
    }

    public static boolean isMatch(String s, String p) {
        String y = "";
        boolean match = false;
        Pattern pt = Pattern.compile(".*");
        Matcher matcher = pt.matcher(p);

        if (matcher.find()) {
            String[] a = p.split(".*");
            System.out.println(Arrays.toString(a));
            for (String j : a){
                if (!j.matches(".*")){
                    y = j;
                }
            }
            if(y.contains("\\.") )
            match = s.contains(y);
        }
        if (p.contains(".")){
            String[] a = p.split("\\.");
            for (String j : a){
                if (!j.matches("\\.")){
                    y = j;
                }
            }
            match = s.contains(y);
        } else if (p.contains("*")) {
            String[] a = p.split("\\*");
            for (String j : a){
                if (!j.matches("\\*")){
                    y = j;
                }
            }
            match = s.contains(y);
        }
        return match;
    }
}
