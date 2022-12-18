package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maxNo = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > maxNo){
               maxNo = num;
            }
        }
        System.out.println("maxNo = " + maxNo);

    }
}
/* write a program that asks the user to enter a number 5 times.

return the maximum number
 */