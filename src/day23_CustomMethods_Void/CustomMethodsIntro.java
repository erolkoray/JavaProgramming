package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsIntro {
    public static void main(String[] args) {

        System.out.println("Test started");

        greeting(); // this copies and reuses the code block below called 'greetings'

        System.out.println("Test completed.");
    }

    public static void greeting() {

        System.out.println("Hello Cydeo!\nHow are you today?");

        Scanner scan = new Scanner(System.in);
        String reponse = scan.nextLine();

    }




}
