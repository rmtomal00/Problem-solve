package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber();
        }
        System.out.println(Arrays.toString(array));
        margeSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public static void margeSort(int[] arr) {
        if (arr.length < 2){
            return;
        }
        int mid = arr.length / 2;
        int[] lift = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        margeSort(lift);
        margeSort(right);

        marge(arr, lift, right);
    }

    private static void marge(int[] arr, int[] lift, int[] right) {
        int lL = 0, rL = 0, aL = 0;
        while (lL < lift.length && rL < right.length){
            if (lift[lL] < right[rL]) {
                arr[aL] = lift[lL];
                lL++;
                aL++;
            }else{
                arr[aL] = right[rL];
                rL++;
                aL++;
            }
        }

        while (lL < lift.length){
            arr[aL] = lift[lL];
            lL++;
            aL++;
        }
        while (rL < right.length){
            arr[aL] = right[rL];
            rL++;
            aL++;
        }
    }
}
