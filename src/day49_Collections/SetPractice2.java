package day49_Collections;

import java.util.*;

public class SetPractice2 { // ONLY TIME YOU'LL USE SET OVER LIST IS IF YOU NEED TO REMOVE DUPLICATES

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,40,30,20,10));

        list = new ArrayList<>(new LinkedHashSet<>(list));
        list = new ArrayList<>(new TreeSet<>(list));

        System.out.println(list);


        String[] array1 = {"A", "A", "B", "C"};
        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array1));
        System.out.println("------------------------------------------------");

        Integer[] nums = {1,2,3,4,5,1,2,3,3,3,3,3,4,5,6,7,8,9,10,1,2,3,1,2,3,4,5,4,4,4,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
                                                                    // giving 0 here means it will use length of linkedhashset

        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------------");

        String str = "eeeeeaaaabbbbcccddddd";
        String result = "";//e5a4b4c3d5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            // above gets rid of all the duplicates and turns it into an array{e,a,b,c,d} by splitting string(eabcd) to array{"e","a","b","c","d"} with "".
            result += each+Collections.frequency( Arrays.asList(str.split("")),each );
            //above splits the String str into an array. From str("eeeeeaaaabbbbcccddddd") then splits each element in the string into an array then gets the frequency - "e"'s frequency is 5 - a's 4 etc. = 54435

            // first gets the 'each' from foreach loop, then adds the frequency
            // one by one does = e5 a4 b4 c3 d5
        }

        System.out.println(result); //e5a4b4c3d5


        System.out.println("--------------------------------------------");

        Set<String> names = new LinkedHashSet<>(); //LINKEDHASHSET MAINTAINS INSERTION ORDER
        names.addAll(Arrays.asList("Koray", "Koray", "John", "james", "breanna", "shay", "Koray"));

        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4));

        System.out.println("---------------------------");

        for (String each: names) {
            System.out.println(each);
        }

    }
}
