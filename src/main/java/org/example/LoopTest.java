package org.example;

public class LoopTest {
    public static void main(String[] args) {

        int z = 50;
        String sz = "aacabdkacaa";
        z = sz.length()-1;
        System.out.println(z);
        int ws = 0;
        int lStart = 0;
        int lEnd = 0;
        int rStart = 0;
        int rEnd = 0;
        while (ws <= z) {
            String zy = "";
            for (int i = 0, j = z; i <= ws; i++, j--) {

                if (sz.charAt(i) == sz.charAt(ws-i)) {
                    //System.out.printf("i = %d, char = %s\n", i, sz.charAt(i));
                    zy += sz.charAt(i);
                    System.out.println(zy);
                }else {
                    zy = "";
                }


                int n = z - (ws-i);
                if (sz.charAt(j) != sz.charAt(n)) {
                    rStart = j +1;
                    rEnd = n -1;
                }
                System.out.println(zy);
                //System.out.printf("Left start: %d, Left end: %d, Right Start: %d, Right End: %d\n", lStart, lEnd, rStart, rEnd);
            }
            ws++;
        }

        System.out.printf("%d\t%d\t%d\t%d\n", lStart, lEnd, rStart, rEnd);
    }
}
