package day37_Inheritence.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("13 pro", "6.7 inches", 1000, "Black");
        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900, "white");
        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Grey");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(124356778);
        iphone.faceTime("koray@cydeo.com");
        iphone.faceTime(13247382);

        System.out.println("-----------------------------------");

        samsung.call(911);
        samsung.text(124356778);
        samsung.freeze();

        System.out.println("-----------------------------------");

        nokia.call(911);
        nokia.text(124356778);
        nokia.selfDefence();

        System.out.println("-----------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(iphone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);


    }



}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

                Add Constructor to set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */