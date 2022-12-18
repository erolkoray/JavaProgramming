package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String operatingSystem = "iOS";
    public String colour;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public static void printModelandPrice(){ // static method can only access the static members of the class. Static does not accept instances.

    //    System.out.println(model+price);
    }

    public void method1(){  // instance methods accepts both static and instance members of the class.
        System.out.println(model+" "+price);
    }





}
