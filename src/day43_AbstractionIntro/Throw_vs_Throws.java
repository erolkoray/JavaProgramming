package day43_AbstractionIntro;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        // THROW KEYWORD - USED TO CREATE AN EXCEPTION (and an optional exception message) WHEN CODING

        System.out.println("Enter your score");
        int score = new Scanner(System.in).nextInt();

        if(score < 0 || score > 100){
            throw new RuntimeException("Invalid Score"+score); // if this program throws an exception it will exit the program exit(1)
                                                                                    //exit(1) - means there is an error in the code
                                                                                    //exit(0) - means there were no errors in the code
        }

        if(score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        }else if (score>=70) {
            System.out.println("C");
        }else if (score>=60) {
            System.out.println("D");
        }else if (score>=50) {
            System.out.println("E");
        }else {
            System.out.println("F");
        }

        System.out.println("------------------------------------------------------");
    }


    // THROWS KEYWORD - THIS IS ONLY FOR CHECKED EXCEPTIONS AND IT WILL TEMPORARILY HANDLE THE EXCEPTION

    public static void method1() throws InterruptedException {
        Thread.sleep(5000);
    }


}
