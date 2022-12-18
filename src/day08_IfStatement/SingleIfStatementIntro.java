package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {



        int num1 = 301;


        /*
        System.out.println("Odd number");

        System.out.println("Even number");


         */

            boolean evenNumber = num1 % 2 == 0;
            boolean oddNumber = num1 % 2 != 0;

            if (evenNumber) {

                System.out.println(num1 + " is even number");
            }

            if (!evenNumber) { // not even number because of ! NOT OPERATOR
                System.out.println(num1 + " is odd number");
            }
            if (oddNumber) {
                System.out.println(num1 + " is odd number!");
            }


        System.out.println("-------------------------------------------------------------");
        int number = -200;

        // positive?
        if(number > 0){ //if (int)number is greater than 0, then this statement will be printed
            System.out.println(number+" is positive.");
        }

        // negative?
        if(number < 0){ //if (int)number is smaller than 0, then this statement will be printed
            System.out.println(number+" is negative.");
        }

        // zero?
        if(number == 0){ //if (int)number is exactly 0, then this statement will be printed
            System.out.println(number+" is zero.");
        }

        System.out.println("---------------------------------------------------");

    }
}
