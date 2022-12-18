package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "Ahmed", "David", "Jimmy", "Daniel", "Arron", "Ali", "David", "Jimmy", "Shay"));

        employees.retainAll(Arrays.asList("David", "Jimmy"));

        System.out.println(employees);

        System.out.println("--------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.startsWith("M"));

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));




    }
}
