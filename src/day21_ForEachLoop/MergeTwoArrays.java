package day21_ForEachLoop;

import java.awt.*;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

            String[] group1 = {"Koray", "Rose","Cydeo", "Baturay", "Serife"}; // 5
        //index # of elements      0        1       2       3           4
        String[] group2 = {"Bean", "Orphy", "Java", "Tom", "Snazzy", "Lynn", "Jill"}; //7

        String[] allStudents = new String[group1.length+ group2.length]; // 13

        int i = 0;
        for (String each : group1) {    // for each, splits all the 'elements' in group1 into separate values
          allStudents[i++]=each; //index [i] = index [0], which is Koray. This line adds Koray to allStudents String, then for loop does the same thing for index[1], which is Rose. Now its Koray, Rose.. etc...
        }

        for (String each : group2) {
            allStudents[i++]=each;
        }

        System.out.println(Arrays.toString(allStudents));

        System.out.println("------------------------------------------------------------------");

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'D','E','F','G','H'};

        char[] allChars = new char[ch1.length+ ch2.length];
        int j = 0;

        for (char each : ch1) {
            allChars[j]=each;
            j++;
        }

        for (char each : ch2) {
            allChars[j]=each;
            j++;
        }

        System.out.println(Arrays.toString(allChars));




    }
}
