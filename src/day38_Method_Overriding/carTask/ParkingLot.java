package day38_Method_Overriding.carTask;

public class ParkingLot {

    // ParkingLot Class HAS A relation with Toyota/ Tesla etc

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Yaris", 2003, "White", 5000, 108000);

        Tesla tesla = new Tesla("Model S", 2022, "black", 20000, 300);

        BMW bmw = new BMW("X6", 2018, "Silver", 18000, 48000);


        toyota.start();
        tesla.start();
        bmw.start();




    }


}
