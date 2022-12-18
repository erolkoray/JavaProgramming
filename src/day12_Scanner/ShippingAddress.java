package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        input.nextLine();

        System.out.println("Enter your zipcode");
        String zipcode = input.nextLine();

        System.out.println("Enter your country name");
        String country = input.nextLine();

        input.close();

        System.out.println("Shipping address is: " + fullName +", "+ buildingNumber +", "+
                streetName +", "+ cityName +", "+ state +", "+ zipcode+", "+ country+".");
    }
}


/*

1. Enter your full name
2. Enter your building number
3. Enter your street name
4. provide your city name
5. provide your state
6. Enter your zipcode

Display the shipping address.
 */