package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {


        // nextLine() - reads everything in the same line until user presses enter (it waits for user to press Enter)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullName = input.nextLine();

        System.out.println("Enter your programming language");

        String programmingLanguage = input.nextLine();

        System.out.println("Enter your age");

        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("Full name = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("School name = " + schoolName);
        System.out.println("Programming Language = " + programmingLanguage);
    }
}
