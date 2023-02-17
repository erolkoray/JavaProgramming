package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {   // INSTEAD OF USING ITERATOR - USE REMOVEIF () METHOD


    public static void main(String[] args) {

        // remove all elements that are less than 4

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // this for loop won't work for this, see below
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list); // result - [2, 4, 5, 2, 4, 5, 2, 4, 5]

        System.out.println("----------------------------------------");

        // remove all elements that are less than 4

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> iterator = list2.iterator();

        /*
        boolean r1 = iterator.hasNext();
        System.out.println("r1 = " + r1);
        System.out.println(iterator.next());
        boolean r2 = iterator.hasNext();
        System.out.println("r2 = " + r2);
        System.out.println(iterator.next());

         */

        while ((iterator.hasNext())){
            if(iterator.next()<4){
                iterator.remove();
            }
        }
        System.out.println(list2);

        System.out.println("----------------------------------------");
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();){

            if(i.next() < 4){
                i.remove();
            }
        }

        System.out.println("list3 = " + list3);

        System.out.println("----------------------------------------");

        //REMOVE IF METHOD TO REMOVE ELEMENTS
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf(each -> each<4);
        System.out.println("list4 = " + list4);

    }
}
