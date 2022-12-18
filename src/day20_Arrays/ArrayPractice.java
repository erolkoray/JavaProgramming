package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        // store the elements=": 10, 20, 50, 70

        Scanner scan = new Scanner(System.in);
        int[] elements = {10,20,50,70};

        System.out.println( Arrays.toString(elements));


        System.out.println("------------------------------------------------------------------");

        // create a variable that can contain 5 scores

        int[] score = new int[5];
        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();
        score[3] = scan.nextInt();
        score[score.length-1] = scan.nextInt();

        System.out.println( Arrays.toString(score));

        scan.close();


    }
}
