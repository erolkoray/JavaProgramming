package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractices {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);


        for (int i = 0; i < list.size() ; i++) {
            list.set(i, list.get(i)*2); // this replaces index number from 0-5 with the same number in that index number multiplied by 2
        }

        System.out.println(list); // 20,40,60,80,100
    }
}
