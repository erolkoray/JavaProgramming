package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        /*
        Write a program that can print the number of the days in a month

        ex:
            number = 1 ~ 12

        output:
            31 Days

        Hints:
            Months that has 31 days: 1-3-5-7-8-10-12
            Months that has 30 days: 4-6-9-11
            Month that has 28 days: 2
        */

        int number = 34;

        boolean has28Days = number == 2; // if its feb
        boolean has30Days = number == 4 ||number ==  6 || number == 9 ||number ==  11; // if the month is apr OR june OR sept OR nov
        boolean has31Days = !has30Days && !has28Days; // meaning if the months are feb, apr, june, sept, nov
                                                    // so months has to be jan, mar, may, july, aug, oct, dec

        if(has28Days){ // if the month has 28 days
            System.out.println("The month has 28 Days");
        }

        if(has30Days){ // if the month has 30 days
        System.out.println("The month has 30 Days");

        }
        if(has31Days){ // if the month has 31 days
            System.out.println("The month has 31 Days");
        }



    }
}
