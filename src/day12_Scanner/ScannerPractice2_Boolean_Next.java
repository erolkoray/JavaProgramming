package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2_Boolean_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Enter True or False");
        boolean result = input.nextBoolean();  // nextBoolean only allows people to enter TRUE or FALSE words, nothing else.

         */
        System.out.println("Enter your name");
        String name = input.next();     // input.next will only read the next word until there is a space. It will not read anything after space

        System.out.println("My name is " + name);

        input.close();
    }
}
