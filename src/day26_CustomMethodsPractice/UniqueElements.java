package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {


    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,6,7,8,4,3,22,4,6,3,2};

       int[] result = uniqueElements(array);

        System.out.println(Arrays.toString(result));


    }

    public static int[] uniqueElements(int[] array){
        int[] result = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequency is 1, then the element is unique.
               result = ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }
}
