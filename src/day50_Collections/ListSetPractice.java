package day50_Collections;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set = " + set);

        System.out.println("------------------------------------");

     // this is how we convert SET to ARRAY
   //     Integer[] array = set.toArray((new Integer[0]));


        System.out.println("------------------------------------");

        // this is how we convert SET to LIST
        List<Integer> list = new ArrayList<>(set);
        System.out.println("list = " + list);

        System.out.println("------------------------------------");




    }
}
