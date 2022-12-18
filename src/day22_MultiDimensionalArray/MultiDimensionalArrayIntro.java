package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"Koray", "Erol", "Rose"};
        String[] group2 = {"Rachel", "Jess", "Kevin"};
        String[] group3 = {"John", "Jennifer", "Erling"};

      //  Add above into 1 Multi Dimentional Array

        String [][] groups = new String[3][]; // index numbers: 0,1,2

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

      //  System.out.println(Arrays.toString(groups)); //toStrong() method is for single dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------------------------------------------------");

        /*
        If you know the arrays then declare below
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}

        HINT- VariableType [] [] VariableName = { {XXX}, {XX}, {XXXX} };
         */
        //index # Elements= 0 1 2    0 1 2 3    0 1 2 3 4 5
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //index # of Arrays=   0         1             2

        System.out.println(Arrays.deepToString(arr2D)); //  {1,2,3}, {4,5,6,7}, {8,9,10,11,12}
        System.out.println(Arrays.toString(arr2D[1]));  // {4,5,6,7} - PRINTS OUT FULL ARRAY
        System.out.println(arr2D[2][3]); // 11  WHEN PRINTING AN ELEMENT YOU DONT NEED TOSTRING() METHOD


    }
}
