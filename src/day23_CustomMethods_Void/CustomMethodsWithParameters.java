package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(23);
        ageOfPerson(1995);
        printNumbers(30,60);

    }
    // create a function that can check if a number is odd or even
    public static void oddOrEven(int number){ // 23

        if (number%2==0){
            System.out.println(number+" is an even number");
        }else {
            System.out.println(number+" is an odd number");
        }

    }

    // Create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age = 2022-birthYear;

        System.out.println("Your age is: "+age);


    }


    // Create a function that can print all the numbers between x and y

    public static void printNumbers(int x, int y){
        int allNumbers = 0;

        for (int i = x; i < y; i++) {
            x += 1;
            System.out.print(x+" ");
        }


    }



}
