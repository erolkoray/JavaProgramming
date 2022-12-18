package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Koray";
        int birthDay = 10;
        String birthMonth = "April";
        int birthYear = 1993;
        String birthDate = "10/April/1993";

        System.out.println(name + " was born on " + birthDay + "/" + birthMonth + "/" + birthYear + ".");
        System.out.println(name + " was born on " + birthDate + ".");


        System.out.println("--------------------------------------------------------------");

// my favourite book is "bookName"

        String bookName = "Memory Wood";

        System.out.println("My favourite book is \"" + bookName + "\".");

    }

}


/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */