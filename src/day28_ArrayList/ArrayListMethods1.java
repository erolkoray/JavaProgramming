package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        // ADD() & INDEX,ADD METHODS

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10); // index 0 - it automatically uses autoboxing here and converts it into wrapper class
        number.add(10); // index 1
        number.add(20); // index 2
        number.add(30); // index 4
        number.add(50); // index 5
        number.add(90); // index 7
        number.add(3, 25); // index 3
        number.add(6,55); // index 6

        System.out.println(number);

        // you can add or remove as many elements as you want into an ArrayList

        System.out.println("--------------------------------------------------");
        //SIZE() METHOD

        System.out.println("total size: "+number.size());

        int lastIndex = number.size() - 1;
        System.out.println("last index: " + lastIndex);

        System.out.println("--------------------------------------------------");
        // GET() METHOD

        Integer num = number.get(3);

        System.out.println(num);

        for (int i = 0; i < number.size(); i++) {

            System.out.println(number.get(i));
        }

        System.out.println("--------------------------------------------------");

        // SET() METHOD - REPLACES THE ELEMENT IN THE OUTLINED INDEX NUMBER TO THE NEW ELEMENT

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replaces the element in index 2 with JavaScript
        list.set(3, "C++");        // replaces the element in index 3 with C++

        System.out.println(list);


        System.out.println("--------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();


      //  REMOVE() METHOD - ***DO NOT USE REMOVE METHOD WITHIN A LOOP

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0); // ELEMENT IN INDEX NUMBER OUTLINED WILL BE REMOVED
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        boolean r1 = employees.remove("Hulya"); // THIS DIRECTLY REMOVES THE OBJECT FROM THE ARRAYLIST (if multiple objects, it will remove the 1st one)
        System.out.println(r1);
        System.out.println(employees);



    }


}
