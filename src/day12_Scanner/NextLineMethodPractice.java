package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA");
        double GPA = input.nextDouble();        // here we will be keying 3.5 ENTER. 3.5 is used by this scanner and ENTER is outstanding

        input.nextLine();               // This uses the outstanding ENTER so user(person inputting the data) can move onto the next requirement

        System.out.println("Enter your School name");
        String schoolName = input.nextLine();

        input.close();

        System.out.println("Full name = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("School name = " + schoolName);
        System.out.println("GPA = " + GPA);




    }
}

/*
Ask user to enter age - nextInt()
Ask user to enter full name - nextLine()
 */