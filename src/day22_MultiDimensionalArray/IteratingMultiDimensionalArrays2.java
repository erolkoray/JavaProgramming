package day22_MultiDimensionalArray;
public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {

        /* TASK 1 - output: 8 9 10 11 12 13
                            4 5 6 7
                            1 2 3
         */
        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };

        for (int i = arr2D.length - 1; i >= 0; i--) { //i: index number of 1 DIMENSIONAL ARRAY starting from last index number to index 0

            for (int j = 0; j < arr2D[i].length; j++) { // j: index number of ELEMENTS starting from index 0 to last index

                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        /* TASK 2 - Output: 3 2 1
                            8 7 6 5 4
                            13 12 11 10 9
        */

        for (int i = 0; i < arr2D.length; i++) { // i: indexes of each 1 Dimensional Array started from index 0

            for (int j = arr2D[i].length-1; j >=0  ; j--) { // j: indexes of each element starting from last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");

        /* TASK 3 - Output: 13 12 11 10 9
                            8 7 6 5 4
                            3 2 1
    //     int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
        */

        for (int i = arr2D.length-1 ; i >= 0; i--) { // i: indexes of each 1 Dimensional Array started from LAST index

            for (int j = arr2D[i].length-1; j >=0  ; j--) { // j: indexes of each element starting from last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------");

        //index # Elements= 0 1 2    0 1 2 3    0 1 2 3 4 5
        int [][] arr2Dimension = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //index # of Arrays=   0         1             2

        for (int[] each1DArray : arr2Dimension) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

        //  HINT: use '.for' after the variable name eg. each1DArray.for - it will automatically create foreach loop for that variable



    }




}
