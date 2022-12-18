package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));
        System.out.println("Enter a number");
        int number = scan.nextInt();

        if(number>7 || number<1){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1].substring(0,3));



    }
}
