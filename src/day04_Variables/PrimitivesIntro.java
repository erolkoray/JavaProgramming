package day04_Variables;

public class PrimitivesIntro {


    public static void main(String[] args) {



        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
     //   byte weight = 160; 160 is out of byte' range
        short weight = 160; // 160 is within the range of short

        // Salary: 100000$

        // short salary = 100000; // this gives error is because 100,000 is out of Short' range

        int salary = 100000; // **** IMPORTANT **** int is the preferred data type for integer numbers

        long asset = 333_333_333_333_333L; //when you use long, you have to put L after the number



        //tax: 0.26

        float tax = 0.26F; //when you use Float, you have to put F after the number

        double PI = 3.14; // **** IMPORTANT **** double is the preferred data type for decimal numbers. You'll use double for all decimals


        // CHAR

        char gender = 'F';
        System.out.println("gender = " + gender); //char is only used for single letter inside ' '

        char ch1 = 34;
        System.out.println("ch1 = " + ch1); //or char can be used from a number in ASCII table

        // STRING

        String name = "Wooden Spoon";
        String footballTeam = "Besiktas Jimnastics Club";
        String Country = "United Kingdom";
        String County = "Greater Manchester";
        String City = "Manchester";
        String Town = "Old Trafford";
        String PhoneNumber = "+44 (0) 777-136-53-23";


        System.out.println("name = " + name);
        System.out.println("footballTeam = " + footballTeam);

        System.out.println("Country = " + Country);
        System.out.println("County = " + County);
        System.out.println("City = " + City);
        System.out.println("Town = " + Town);
        System.out.println("PhoneNumber = " + PhoneNumber);


    }



}
