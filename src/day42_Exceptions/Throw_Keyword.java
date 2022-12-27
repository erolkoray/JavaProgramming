package day42_Exceptions;

import java.io.UncheckedIOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Keyword {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if(age <= 0){
            System.err.println("Invalid age: "+age);
            throw new InputMismatchException("age cannot be zero or negative: "+age);
        }

        if(age >= 21){
            System.out.println("You are eligible");
        }else {
            System.err.println("You are not eligible");
            throw new RuntimeException("You must be at least 21 years old");
        }



    }
}

