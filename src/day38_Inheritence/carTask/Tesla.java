package day38_Inheritence.carTask;

public class Tesla extends Car{

    public Tesla(String model, int year, String colour, double price, int miles) {
        super("Tesla", model, year, colour, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" is on autopilot");
    }
}
