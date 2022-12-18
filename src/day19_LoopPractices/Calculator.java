package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n1 = scan.nextInt();
        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0); // "+" or "-" or any other maths operator will have the index number of 0. So when using char we need to use the scan.next() and charAt() methods.

        if(!(operator == '+' || operator == '-')){

            System.err.println("Invalid math operator: " + operator);
            System.exit(0);
        }

        System.out.println("Enter a number");
        int n2 = scan.nextInt();


        if(operator == '+'){
            System.out.println(n1 + n2);
        }else {
            System.out.println(n1 - n2);
        }
    }
}
