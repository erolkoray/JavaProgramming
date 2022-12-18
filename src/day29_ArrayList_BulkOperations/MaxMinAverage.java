package day29_ArrayList_BulkOperations;

import java.util.ArrayList;

public class MaxMinAverage {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for (Integer each : list) {
            if(each > max){
                max = each;
            }
        }

        for (Integer each : list) {
            if(each < min){
                min = each;
            }
            sum += each;
        }

        double average = (double)sum/ list.size(); // because sum is currently an integer(int) number, it needs to be convereted to double




        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("average = " + average);




    }
}
