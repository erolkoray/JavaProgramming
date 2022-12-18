package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str = "aaabcccdeeefhiiiiiijkkkkkkl";

        String [] arr = str.split(""); // turn the String str into an Array

        ArrayList<String > list = new ArrayList<>(Arrays.asList(arr)); // Turn that Array into an ArrayList

        System.out.println("list = " + list);

        list.removeIf(p -> Collections.frequency(list, p) >1); // finds the frequency of the same array within the ArrayList and unique chars

        System.out.println("unique characters:" + list);







    }
}
