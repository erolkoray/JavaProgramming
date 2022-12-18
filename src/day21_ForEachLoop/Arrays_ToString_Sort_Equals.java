package day21_ForEachLoop;

import java.util.Arrays;

public class Arrays_ToString_Sort_Equals {

    public static void main(String[] args) {



        // TO.STRING() METHOD - USE THIS METHOD ON ANY SINGLE DIMENSIONAL ARRAY (ONLY IF YOU ARE PRINTING THE WHOLE ARRAY)
        int[] nums = {1,2,3,4,5};

        System.out.println(nums); // hashcode (error)
        System.out.println(Arrays.toString(nums)); // "{1,2,3,4,5}"

        /*
        String str = "java";
        System.out.println(str);
        System.out.println(str.toString());
         */
        System.out.println("----------------------------------------------------------------");

        //SORT METHOD - Arrays.sort(variable name); - SORTS THE ARRAY IN ASCENDING ORDER

        int[] scores = {95, 100, 55, 65, 85, 78};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("min score: "+scores[0]);
        System.out.println("max score: "+scores[scores.length-1]);

        String names[] = {"Gunay", "Anna", "Zuhal", "Aaron","Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        System.out.println("First name is: "+names[0]); // Aaron
        System.out.println("Final name is: "+names[names.length-1]); //Zuhal


        String[] words ={"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words)); // [ANNA, Anna] because 'N' has a lower number on the hesky table

        System.out.println("----------------------------------------------------------------");

        // EQUALS() METHOD - CHECKS IF TWO ARRAYS ARE EQUAL, RETURNS BOOLEAN

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};

        boolean r1 = Arrays.equals(arr1, arr2);// false because they are not equal

        System.out.println(r1); // false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2); // true because both variables have been sorted in ascending order

        System.out.println(r2); // true


        System.out.println("-----------------------");
        //Anagram words are built by only using same characters
        // "acb", "bac"

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); // {a, b, c}
        Arrays.sort(ch2); // {a, b, c}

        boolean isAnagram = Arrays.equals(ch1,ch2);

        System.out.println(isAnagram); // true


        System.out.println("----------------------------------------------------------------");




    }
}
