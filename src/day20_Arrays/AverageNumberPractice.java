package day20_Arrays;

import java.util.Scanner;

public class AverageNumberPractice {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int numberOfNumbers = scan.nextInt();

        double numbers[] = new double[numberOfNumbers];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextDouble();
            sum += numbers[i];

        }

        double averageNumber = sum/numberOfNumbers;

        System.out.println(averageNumber);

        scan.close();

    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */