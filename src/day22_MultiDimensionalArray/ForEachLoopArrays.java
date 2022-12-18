package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoopArrays {

    public static void main(String[] args) {

        //index # Elements= 0 1 2    0 1 2 3    0 1 2 3 4 5
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //index # of Arrays=   0         1             2

       for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

       //  HINT: use '.for' after the variable name eg. each1DArray.for - it will automatically create foreach loop for that variable



    }
}
