package org.example;

import java.util.Arrays;

public class DynamicArray {
    private int[] array = new int[5];
    private int size = 0;
    public void push(int value) {
        if (size > array.length-1) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;

    }
    public void pop() {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }
        int[] newArray = new int[size - 1];
        System.arraycopy(array, 0, newArray, 0, size - 1);
        array = newArray;
        size--;
    }
    public int peek(int index) {
        if (size == 0) {
            System.out.println("Array is empty");
        }
        return array[index];
    }
    public void deleteByIndex(int index) {
        if (size == 0) {
            System.out.println("Array is empty");
        }
        int[] newArray = new int[size - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i >= index) {
               newArray[i] = array[i+1];
            }else{
                newArray[i] = array[i];
            }

        }
        size--;
        array = newArray;
    }

    public int[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 25; i++) {
            dynamicArray.push(i);
        }
        System.out.println(Arrays.toString(dynamicArray.getArray()));
        for (int i = 0; i < 7; i++) dynamicArray.pop();
        System.out.println(Arrays.toString(dynamicArray.getArray()));
        for (int i = 0; i < 10; i++) {
            dynamicArray.push(i);
        }
        System.out.println(Arrays.toString(dynamicArray.getArray()));
        for (int i = 5; i < 10; i++) {
            dynamicArray.deleteByIndex(i);
        }
        System.out.println(Arrays.toString(dynamicArray.getArray()));
        dynamicArray.push(100);
        System.out.println(Arrays.toString(dynamicArray.getArray()));
    }
}
