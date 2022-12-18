package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(400);
        list.add(500);
        list.add(200);
        list.add(400);

        System.out.println(list);
        // int num = 1; - this is INT so its a PRIMITIVE
        // list.remove(num); - this removes the element in the index number outlined in variable num.

        Integer num = 200; // this is NOT a primitive
        boolean r1 = list.remove(num); // this is "200"
        System.out.println(r1);
        System.out.println(list); // first "200" is removed from the ArrayList

   //     CLEAR() METHOD - CLEARS ALL THE ELEMENTS IN THE ARRAYLIST - SIZE WILL BE 0

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

        System.out.println("---------------------------------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A'); // 0 *
        characters.add('A'); // 1
        characters.add('A'); // 2
        characters.add('A'); // 3
        characters.add('A'); // 4
        characters.add('A'); // 5
        characters.add('A'); // 6 *


        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        System.out.println("---------------------------------------------------------------------");

      //CONTAINS() METHOD

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------------------------------------------------");

        // EQUALS() METHOD- COMPARES THE EACH ELEMENT IN EACH INDEX ON EACH ARRAY.

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2); // false - because these are two different objects although it has the same ingredients/elements
        System.out.println(list1.equals(list2)); // true - because they both have the same element

        System.out.println("---------------------------------------------------------------------");

        boolean r4 = list1.isEmpty(); // false because it contains elements at the moment

        System.out.println("r4 = " + r4);

        list1.clear(); // we just cleared the list with the clear() method

        boolean r5 = list1.isEmpty(); // true because now list1 does not contain anything

        System.out.println("r5 = " + r5);

    }


}
