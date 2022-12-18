package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,6,8,9,0,1,8));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {

            int frequency = Collections.frequency(list, each);
            if(frequency == 1){
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,4,3,5,5,6,7,7,8,9,10,10,12,11,12));

        ArrayList<Integer> unique2 = new ArrayList<>(list1); // this adds all the elements in list1 to ArrayList Unique2

        unique2.removeIf(p -> Collections.frequency(list1, p) > 1);

        System.out.println(unique2);


    }
}
