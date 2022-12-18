package day05_Concatenation;

public class FullName {


    public static void main(String[] args) {


        String firstName = "Koray";
        String lastName = "Erol";
        String fullName = firstName +" " + lastName;

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        System.out.println("fullName = " + fullName);

        // Full name of the person is _____

        System.out.println("Full name of the person is " + fullName);

        int age = 45;

        // ____ is ____ years old.

        System.out.println(fullName + " is " + age + " years old.");

        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        int salary = 100000;

        //FullName is a jobTitle, works at companyName, and fullName' salary is Salary

        System.out.println(fullName + " is a " + jobTitle + "," + " he works at " + companyName + ", and " + fullName + "' salary is $" + salary + "." );


    }


}
