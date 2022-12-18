package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 5;
        for (int i = 1; i < n; i++) {       // this removed the maximum number from the arrayList 4 times (refer to int n)
            list.removeIf(p -> Collections.max(list) == p);
        }
        System.out.println(list); //  [1, 2, 3, 4]

        int max  =  Collections.max(list); // because first 4 max numbers have been removed from the list, new max number is 4
        
        System.out.println(max);




    }
}
// write a program that can return the nth largest number from an ArrayList