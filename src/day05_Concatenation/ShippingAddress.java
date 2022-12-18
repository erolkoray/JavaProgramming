package day05_Concatenation;

public class ShippingAddress {


    public static void main(String[] args) {

        String name = "Koray Erol",
                buildingNumber = "30",
                streetName = "Thorpe Street",
                city = "Manchester",
                state = "Greater Manchester",
                zipCode= "M169PR";

        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);


        String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;


        System.out.println(shippingAddress);



    }

}


/*
Jimmy Joe
7925 Jones Branch Dr
Mclean, VA 20125
 */


/*
Declare the following variables:
name
building number
street name
city
state
zip code
 */


