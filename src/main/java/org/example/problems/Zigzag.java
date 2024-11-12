package org.example.problems;

public class Zigzag {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
        /*P   A   H   N
          A P L S I I G
          Y   I   R*/

      /*P     I    N
        A   L S  I G
        Y A   H R
        P     I*/
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String result = "";
        int lent = s.length();
        for (int i = 0; i < numRows; i++) {
            int firstAndLast = (numRows - 1) * 2;
            int firstRun = (int) Math.ceil((double) lent /firstAndLast);
            int secondAndLast = (numRows - 1) * 2 -(2 * i);
            if (i == 0 || i == numRows - 1) {
                int tookIndex = i;
                for (int j = 0; j < firstRun; j++) {
                    if (tookIndex < lent){
                        result += s.charAt(tookIndex);
                    }
                    tookIndex += firstAndLast;
                }
            }else{
                int tookIndex = i;
                for (int j = 0; j < firstRun; j++) {
                    if (tookIndex < lent){
                        result += s.charAt(tookIndex);
                        if (tookIndex + secondAndLast < lent){
                            result += s.charAt(tookIndex + secondAndLast);
                        }
                    }
                    tookIndex += firstAndLast;
                }

            }
        }
        return result;
    }
}
