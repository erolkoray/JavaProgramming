package day03_EscapeSequence;

public class Println_VS_Print2 {


    public static void main(String[] args) {


        System.out.println("Knock Knock"); // First it prints Knock Knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("-------------------------------");

        System.out.print("Knock Knock");   // prints Knock Knock, and it does not append new line. All in one line
        System.out.print("Who is this?");

        System.out.print("This is Java");

        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Hello everyone! How are you all today? Today we will learn Escape sequence today, and next week we will learn variables");
        System.out.println("-------------------------------");

        System.out.print("Hello Everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequence, ");
        System.out.print("and next week we will learn Variables");


    }


}
