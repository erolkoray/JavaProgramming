package day15_ForLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("---------------------------------------------------------------");


        // Ask user to enter 5 numbers and give them a total;

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();
        }
        System.out.println("total = " + total);

        scan.close();


/* BELOW IS WITHOUT FOR LOOP
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scan.nextInt();
        System.out.println("Enter fourth number");
        int fourthNumber = scan.nextInt();
        System.out.println("Enter fifth number");
        int fifthNumber = scan.nextInt();

        total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        System.out.println("total = " + total);

 */



    }
}
