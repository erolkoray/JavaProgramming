package day38_Method_Overriding.carTask;

public class Tesla extends Car{

    public Tesla(String model, int year, String colour, double price, int miles) {
        super("Tesla", model, year, colour, price, miles);
    }

    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" is on autopilot");
    }
}
