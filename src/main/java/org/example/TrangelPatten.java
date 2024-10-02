package org.example;

public class TrangelPatten {
    public static void main(String[] args) {
        int n = 7;
        int m = 5;
        int i = 0;
        int j = 0;
        /*for (i = 0; i < m; i++ ){
       System.out.println();     for (j = 0; j < n; j++ ){
                if(i > j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            n--;
            if (n==0){
                n = 7;
                i = 0;
                j = 0;
            }else {
                System.out.println();
            }
        }*/
        /*while (i < m){
            while (j < n){
                if(i > j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                j++;
            }
            j = 0;
            n--;
            i++;
            System.out.println();
        }*/
        int k = 1;
        int z = 7;
        for(int x = 0; x < 5; x++) {
            for(int y = 0; y < 15; y++) {
                if (y == z){
                    System.out.print(" ");
                    z = (z * 2) + 1;
                }else {
                    System.out.printf("*");
                }
            }
            z = 7;
            System.out.println();
        }
    }
}
