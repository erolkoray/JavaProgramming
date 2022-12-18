package day11_Switch_Scanner;

import java.io.PrintStream;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int months = 2;
        String result = "";

        if (months >= 1 && months <= 12) {

            switch (months) {

                case 2:
                    result = (year % 4 ==0)? "Month has 29 days" : "Month has 28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "Month has 30 days";
                    break;
                default:
                    result = "Month has 31 days";

            }

            System.out.println(result);


        }else {
            System.out.println("Invalid Entry");
        }
    }
}
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */