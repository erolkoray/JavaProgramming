package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = new int[arr1.length+ arr2.length];

        int i = 0;

        for (int each : arr1) {
            arr3[i] = each; //
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));









    }
}
/* Write a program that can merge two array of integers.
input:
        arr1 = {1,2,3,4};
        arr2 = {5,6};
output:

        arr3 = {1,2,3,4,5,6}

 */