package day43_AbstractionIntro.car;

public final class Audi extends Car { //CHILD OF AN ABSTRACT CLASS HAS TO OVERRIDE ALL THE ABSTRACT METHODS

    public Audi(String model, String colour, int year, double price) {
        super("Audi", model, colour, year, price);
    }

    public void start() {
        System.out.println("Push the start button the start the engine");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }
}
