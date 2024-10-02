package org.example.problems;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Solve9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long sub = (long) (Math.pow(a, b) - Math.pow(b,a));

        BigInteger ita = BigInteger.valueOf(a);
        BigInteger itb = BigInteger.valueOf(b);

        BigInteger subBing = ita.pow((int) b).subtract(itb.pow((int) a));

        System.out.printf("");
        checkType(sub);
    }

    public static <T extends Object> void checkType(T object) {
        if (object instanceof Integer)
            System.out.println("Integer ");
        else if(object instanceof Double)
            System.out.println("Double ");
        else if(object instanceof Float)
            System.out.println("Float : ");
        else if(object instanceof List)
            System.out.println("List! ");
        else if(object instanceof Set)
            System.out.println("Set! ");
        else if (object instanceof String) {
            System.out.println("Str! ");
        } else if (object instanceof Character) {
            System.out.println("Char! ");
        } else if (object instanceof Long) {
            System.out.println("Long! ");
        }
    }
}
