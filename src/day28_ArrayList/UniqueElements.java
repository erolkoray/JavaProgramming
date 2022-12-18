package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {

            if(list.indexOf(each) == list.lastIndexOf(each)){ // checks if the first and last time an 'element' appeared in the ArrayList 'List' in the same index number
                unique.add(each); // if the if statement is true, it will add the 'element' to the ArrayList 'Unique'
            }

        }
        System.out.println(unique);

        System.out.println("-----------------------------------------------------------------------");




    }
}
