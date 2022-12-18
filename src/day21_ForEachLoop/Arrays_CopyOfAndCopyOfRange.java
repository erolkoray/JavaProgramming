package day21_ForEachLoop;

import java.util.Arrays;

public class Arrays_CopyOfAndCopyOfRange {

    public static void main(String[] args) {

        // COPYOF() METHOD - IT WILL ALWAYS START COPYING FROM FIRST ELEMENT (ELEMENT 0, until given number)

        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String [] earlyBirds = Arrays.copyOf(students, 2);

        System.out.println(Arrays.toString(earlyBirds));


        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5); // re-assigned the first 5 elements back to the 'numbers' Array

        System.out.println(Arrays.toString(numbers));


        System.out.println("-------------------------------------------------------------------");

        //COPYOFRANGE (Array, beginningIndex, endingIndex)

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
                //     0   1   2   3   4   5   6   7   8
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6); // - last index is excluded

        System.out.println(Arrays.toString(ch2)); //C, D, E, F

        char[] ch3 = Arrays.copyOfRange(ch1, 2, 6+1); // it will include the 6th element

        System.out.println(Arrays.toString(ch3)); //C, D, E, F, G

        System.out.println("-------------------------------------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] result = Arrays.copyOfRange(scores, 3, 8);
        System.out.println(Arrays.toString(result)); // 40, 50, 60, 70, 80

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2)); //60, 70, 80, 90, 100


    }
}
