package day43_AbstractionIntro.car;

public final class Tesla extends Car{

    // FINAL METHODS CAN BE INHERITED TO OTHER CLASSES, IT CANNOT BE OVERRIDDEN
    // MAKING CLASS FINAL MEANS OTHER CLASSES CANNOT EVEN INHERIT ANYTHING FROM A FINAL CLASS
    public Tesla(String model, String colour, int year, double price) {
        super("Tesla", model, colour, year, price);
    }

    public void start() {
        System.out.println("Use your phone to start the engine");
    }


    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has autopilot feature");
    }
}
