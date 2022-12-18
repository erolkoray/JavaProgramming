package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxNumberOfArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");

            numbers[i] = scan.nextInt(); // each user entered input will be assigned to the indexes of the array numbers


        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i]<min){
                min = numbers[i];
            }

        }

        System.out.println("Numbers are "+ Arrays.toString(numbers) +"\nMaximum number is "+max+"\nMinimum number is "+min);


    }
}

/* write a program that assk user to enter a number 10 times
1. store all suer entred numbers in an array
2. find min number
3. find max number
 */