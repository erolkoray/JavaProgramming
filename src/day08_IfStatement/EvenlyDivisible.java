package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        /*
        2. Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
         */

        int givenNumber = 65;
        boolean isDivisibleBy2 = givenNumber % 2 == 0;
        boolean isDivisibleby3 = givenNumber % 3 == 0;
        boolean isDivisibleby5 = givenNumber % 5 == 0;

        System.out.println(givenNumber + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(givenNumber + " is divisible by 3: " + isDivisibleby3);
        System.out.println(givenNumber + " is divisible by 5: " + isDivisibleby5);





    }

}
