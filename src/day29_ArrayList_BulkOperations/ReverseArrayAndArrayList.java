package day29_ArrayList_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int [] result = new int[array.length]; // creating a new Array that has the same number of elements (array size is always fixed)
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) { // i = 5(index number: which is '6' in the int[] array) then it reduces one by one
            result[j] = array[i]; // result Array index 0 will be array Array index 5(which is '6'), then it will work backwards from there. Result index 1 = array index 4('5'), index 2 = array index 3('4') etc.
        }

        System.out.println(Arrays.toString(result));


        System.out.println("-------------------------------------------------------------");
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println("list = " + list);

        ArrayList<Integer> reversedList= new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reversedList.add(each);

        }

        System.out.println("reversedlist: " +reversedList);

    }
}
