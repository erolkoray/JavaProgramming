package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

     //   SORT() METHOD
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll((Arrays.asList(10,9,8,7,6,5,4,3,2,1)));
        System.out.println(list); // 10,9,8,7,6,5,4,3,2,1

        Collections.sort(list);
        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("------------------------------------------------------------");

    // REVERSE() METHOD

        ArrayList<Character> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list1); // 'A', 'B', 'C', 'D', 'E'

        Collections.reverse(list1);
        System.out.println(list1); // [E, D, C, B, A]

        System.out.println("------------------------------------------------------------");

        // SWAP() METHOD

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
        System.out.println(list2); // [10, 20, 30, 40, 50, 60, 70, 80, 90]

        Collections.swap(list2, 2, 5);
        System.out.println(list2); // [10, 20, 60, 40, 50, 30, 70, 80, 90]


        System.out.println("------------------------------------------------------------");

     //   MAX() & MIN() METHODS - assign the Max() and Min() methods to a primitive or non-primitive data type

        int max = Collections.max(list2);
        System.out.println("max = " + max);  // 90

        int min = Collections.min(list2);
        System.out.println("min = " + min);; // 10

        System.out.println("------------------------------------------------------------");

      //REPLACEALL() METHOD

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(10,10,10,20,30,40,40,50,60,70,10,50,10));
        System.out.println("list3 = " + list3);

        Collections.replaceAll(list3, 10, 1000);

        System.out.println("list3 after replace all= " + list3);

        System.out.println("------------------------------------------------------------");

    //  FREQUENCY() METHOD

        int frequency = Collections.frequency(list3, 1000); // finds the frequency of 10 in ArrayList List3

        System.out.println("frequency = " + frequency);


        System.out.println("------------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#","Java"));

        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
