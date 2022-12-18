package day24_CustomMethods_Return;

import java.util.Arrays;

public class WarmUp_Tasks {
    public static void main(String[] args) {

        initials("koray", "erol");
        domain("koray@hotmail.com");

        System.out.println("-----------------------------------------------------");

//Create a method that can display the domain of every email address in the array below
        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------------------------------------------------");

        nameOfMonth(4);

        System.out.println("-----------------------------------------------------");

        nameOfDay(6);

        System.out.println("-----------------------------------------------------");

        daysOfMonth(8);

        System.out.println("-----------------------------------------------------");

        ageGroups(67);




    }

    //1. Create a method that can display the initials of the person

    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0)+". "+lastName.charAt(0)+".";
        initial = initial.toUpperCase();
        System.out.println("initials: "+initial);

    }

    //2. Create a method that can display the domain of the email

    public static void domain(String email){

        String domain = email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
        System.out.println(domain);


    }

    //3.  Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sept" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        } else {
            System.out.println("invalid");
        }

        System.out.println("Month name: "+name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){

    String name = "";

    if(number >= 1 && number <= 7){
        name = (number == 1)?"Monday":(number == 1)?"Tuesday":(number == 2)?"Wednesday":(number == 3)?"Thursday":(number == 5)?"Friday":(number == 6)?"Saturday": "Sunday";
    }else {
        System.out.println("invalid entry");
    }

        System.out.println("Day name: "+name);

    }

    //5. Create a method that can print how many days a month has

    public static void daysOfMonth(int number){

        int numberOfDays = 0;

        if(number >= 1 && number <= 12){

            numberOfDays = (number == 1)?31:(number == 2)?28:(number == 3)?31:(number == 4)?30:(number == 5)?31:(number == 6)?30:(number == 7)?31:(number == 8)?31:(number == 9)?30:(number == 10)?31:(number == 11)?30: 31;

        }else {
            System.out.println("invalid entry");
        }

        System.out.println("Month has "+numberOfDays+" days.");



    }

    /*6. ageGroups
    age groups are:
                   infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                   Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                   Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                   Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                   Senior Citizen (75 - 84),
                   Old Senior Citizen (85+)
     */

    public static void ageGroups(int age){

        String ageGroup = "";

        if(age > 0 && age < 99){

            ageGroup =  (age == 1 || age == 2)?"Infant":(age >= 3 && age <= 5)?"Toddler":(age >= 6 && age <= 9)?"Kid":(age >= 10 && age <= 12)?"Pre-teen":(age >= 13 && age <= 17)?"Teenager":(age >= 18 && age <= 20)?"Young Adult":(age >= 21 && age <= 39)?"Adult":(age >= 40 && age <= 49)?"Young Middle-Aged Adult":(age >= 50 && age <= 54)?"Middle Aged Adult":(age >= 55 && age <= 64)?"Very Young Senior Citizen":(age >= 65 && age <= 74)?"Young Senior Citizen":(age >= 75 && age <= 84)?"Senior Citizen": "Old Senior Citizen";

        }else {
            System.out.println("Invalid entry");
        }
        System.out.println(ageGroup);
    }

}
