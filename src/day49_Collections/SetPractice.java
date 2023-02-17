package day49_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice { // ONLY TIME YOU'LL USE SET OVER LIST IS IF YOU NEED TO REMOVE DUPLICATES

    public static void main(String[] args) {


        String[] arr = {"Wooden spoon", "Book", "Pen", "Phone", "Wooden spoon", "Wooden spoon", "Wooden spoon","Wooden spoon", "milk", "eggs", "coke", "paper towels"};
       // route 1
        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
       // route 2
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(set1.toArray(new String[0]));

        System.out.println(set1);

        System.out.println(Arrays.toString(arr));


    }

}
