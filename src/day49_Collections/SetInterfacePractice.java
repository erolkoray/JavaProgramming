package day49_Collections;

import java.util.*;

// ONLY TIME YOU'LL USE SET OVER LIST IS IF YOU NEED TO REMOVE DUPLICATES

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // DOESN'T REMOVE DUPLICATES & HAS INDEX NUMBERS - ACCEPTS NULL
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);
        System.out.println(list.get(4));

        System.out.println("------------------------------------------------------------");
        System.out.println();

        Set<Integer> hashset = new HashSet<>();         // HASHSET REMOVES DUPLICATES & IS IN RANDOM ORDER - ACCEPTS NULL
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));
        hashset.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("HashSet =" + hashset);
      //  System.out.println(hashset.get(4));

        Set<Integer> linkedhashset = new LinkedHashSet<>();       // LINKEDHASHSET REMOVES DUPLICATES & MAINTAINS INSERTION ORDER - ACCEPTS NULL
        linkedhashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedhashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedhashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedhashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedhashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedhashset.addAll(Arrays.asList(null ,null, null, null));

        System.out.println("linkedhashset = " + linkedhashset);

        System.out.println("-------------- YOU WONT USE TREESET IN REAL LIFE-----------");
        // YOU WONT USE TREESET IN THE FUTURE IN REAL LIFE
        Set<Integer> treeSet = new TreeSet<>();                     // TREESET REMOVES DUPLICATES & SORTS IN ASCENDING ORDER - DOES NOT ACCEPT NULL
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("treeSet = " + treeSet);






    }
}
