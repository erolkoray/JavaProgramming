package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


        //index # Elements= 0 1 2    0 1 2 3    0 1 2 3 4 5
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //index # of Arrays=   0         1             2

        for (int i = 0; i < arr2D.length; i++) { // i= index numbers of single dimensional array

        System.out.println(Arrays.toString(arr2D[i])); // this prints out the full arrays one by one (array 1, array 2, array 3)
            for (int j = 0; j < arr2D[i].length; j++) { //j= index number of elements inside arrays

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();
        }

    }
}
