package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names

        String[] myGroups = new String[5]; //0-4
        myGroups[4] = "Gunay";
        myGroups[3] = "Neira";
        myGroups[2] = "Suat";
        myGroups[1] = "Hulya";
        myGroups[0] = "Mikael";

       // System.out.println(myGroups); // hashcode
        System.out.println(Arrays.toString(myGroups));


        int[] myGroups1 = new int[5];

        System.out.println(Arrays.toString(myGroups1));



    }
}
