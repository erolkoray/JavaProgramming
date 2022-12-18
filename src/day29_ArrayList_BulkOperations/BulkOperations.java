package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

   //     ADDALL() METHOD - adds objects that are matching with the outlined elements

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,3,3,5,5,5,8,8,8,6,7,8));

        System.out.println(list);

   //    REMOVEALL() METHOD - removes objects that are matching with the outlined elements

        list.removeAll(Arrays.asList(3,5,8)); // this will remove all the numbers from the ArrayList that matches the elements in AsList

        System.out.println(list); // [1, 2, 4, 6, 7, 6, 7]

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

   //   RETAINALL() METHOD - this method will remove all numbers from the ArrayList that are NOT matching with the elements outlined in the asList

        numbers.retainAll(Arrays.asList(100,200,300)); // this method will remove all elements except 100,200,300

        System.out.println(numbers); // [100, 200, 300, 100, 200, 300]

        System.out.println("------------------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("Qa", "SDET", "Developer", "Qa", "SDET", "Scrum Master", "QA","BA", "ba"));

        jobTitles.retainAll(Arrays.asList("QA","Qa","SDET"));

        System.out.println(jobTitles); //[Qa, SDET, Qa, SDET, QA]

        System.out.println("------------------------------------------------------------");


   //   CONTAINSALL() METHOD - checks if ALL the elemenmts contained in the ArrayList

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,6,7,8,9,10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(7);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10,1,4));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("------------------------------------------------------------");

      //  CONVERT ARRAYS INTO ARRAYLIST

        // - Convert Non-Primitive

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names)); // you can convert Arrays to ArrayList like this if its NON-PRIMITIVE

        /* nameList.addAll(Arrays.asList(names));
        System.out.println("nameList = " + nameList);
        */

        System.out.println("nameList = " + nameList);

        System.out.println("------------------------------------------------------------");

        // - Convert Primitives - there is not a method for this but custom methods can be created.

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10}; // swap int[] (primitive) with Integer[] (Wrapper Class)

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list2 = " + list2); // this prints because int array converted to Integer wrapper class

        System.out.println("------------------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer>list3= new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);

        System.out.println("------------------------------------------------------------");

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
