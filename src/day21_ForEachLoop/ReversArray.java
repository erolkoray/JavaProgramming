package day21_ForEachLoop;

import java.util.Arrays;

public class ReversArray {

    public static void main(String[] args) {



        int[] numbers = {10,20,30,40,50,60,70,80,90};
        
        //get this ---> {90,80,70,60,50,40,30,20,10}

        int [] reversedNumber = new int[numbers.length]; // to make sure that the array has enough capacity to contain all the elements of the first array above
        
            for (int i = numbers.length-1, j=0; i >= 0; j++, i--) {

                reversedNumber[j] = numbers[i];
            }

        System.out.println(Arrays.toString(reversedNumber));


    }
}
