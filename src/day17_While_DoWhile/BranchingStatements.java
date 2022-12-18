package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {


        for (char i = 'A'; i < 'Z'; i++) {

            if(i=='F'){
                break;      // EXITS THE LOOP. FORCES LOOP TO END
            }
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");

        Scanner scan = new Scanner(System.in);



        while (true){
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number < 0 || number > 10){
                break;
            }
        }




    }
}
