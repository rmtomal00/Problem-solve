package org.example.problems;

public class MargeTwoArray {
    public static void main(String[] args) {
        int[] a1 = {0,0,0,0,0};
        int[] a2 = {-1,0,0,0,0,0,1};
        System.out.println(findMedianSortedArrays(a1, a2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newNums = new int[nums1.length + nums2.length];
        int index2 = 0;
        int index1 = 0;
        for(int i = 0; i < newNums.length; i++){
            if (nums1.length != 0 && nums2.length != 0){
                if (i < nums2.length && i < nums1.length) {
                    if (nums1[index1] > nums2[index2]) {
                        newNums[i] = nums2[index2];
                        index2++;
                    }else{
                        newNums[i] = nums1[index1];
                        index1++;
                    }
                }else {
                    if(index1 != nums1.length && index2 != nums2.length){
                        if (nums1[index1] > nums2[index2]) {
                            newNums[i] = nums2[index2];
                            index2++;
                        }else{
                            newNums[i] = nums1[index1];
                            index1++;
                        }
                    }
                }
            }
        }

        int arrLen = index1 + index2;
        while (index1 < nums1.length) {
            newNums[arrLen] = nums1[index1];
            index1++;
            arrLen++;
        }
        while (index2 < nums2.length) {
            newNums[arrLen] = nums2[index2];
            index2++;
            arrLen++;
        }
        double result = 0;
        if(newNums.length % 2 != 0){
            result = newNums[newNums.length / 2];
        }else {
            int mid =  newNums.length / 2;
            result = (double) (newNums[mid-1] + newNums[mid]) / 2;
        }

        return result;
    }
}
