package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------------------------------------------");

        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("-----------------------------------------------------");

        char [] arr3 = {'A','B','C','D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("-----------------------------------------------------");

        String [] arr4 = {"Koray", "Rose", "Erol", "Lambert"};

        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------------------------------------------");

        int [] arr5 = {3,56,785,2,678,12,56,87,38};

        int max = ArraysUtility.maxNumber(arr5);

        System.out.println(max);

        System.out.println("-----------------------------------------------------");

        double [] arr6 = {1.1,2.2,3.3,4.4,5.5,7.6,9.3,3.4,12.5,6.9,23.6,1.9};

        double max1 = ArraysUtility.maxNumber(arr6);

        System.out.println(max1);

        System.out.println("-----------------------------------------------------");

        double [] arr7 = {1.1,2.2,3.3,4.4,5.5,7.6,9.3,3.4,12.5,6.9,23.6,1.9};

        double min = ArraysUtility.minNumber(arr7);

        System.out.println(min);

        System.out.println("-----------------------------------------------------");

        int [] arr8 = {3,56,785,2,678,12,56,87,38};

        int min1 = ArraysUtility.minNumber(arr8);

        System.out.println(min1);

        System.out.println("-----------------------------------------------------");

        int[] a1 = {1,2,3,4,5,6,7};
        boolean result = ArraysUtility.contains(a1,6);
        System.out.println(result); // true because 6 is contained in the Array a1

        System.out.println("-----------------------------------------------------");

        double[] a2 = {1.4,2.3,3.2,4.8,5.5,6.9,7.1};
        boolean result1 = ArraysUtility.contains(a2,3.2);
        System.out.println(result1); // true because 3.2 is contained in the Array a2

        System.out.println("-----------------------------------------------------");

        char [] a3 = {'A','B','C','D','E'};
        boolean result2 = ArraysUtility.contains(a3,'G');
        System.out.println(result2); // false because 'G' is contained in the Array a3

    }

}
