package day20_Arrays;

import java.util.Arrays;

public class NamesOfTheMonth {

    public static void main(String[] args) {


        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
            //                 0        1         2       3      4      5      6       7        8           9         10          11


        for (int i = 0; i < month.length; i++) {  // i: represents the index number of array starting from 0, 1-2-3-4-5-6-7-8-9-10....
            System.out.println(month[i]);

        }

        System.out.println("----------------------------------------------------------------------");

        for(int i = month.length-1; i >=0; i--){    // i: represents the index number of array starting from last index number 12-11-10-9-8-7-6...
            System.out.println(month[i]);
        }




    }
}
