package day38_Method_Overriding.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, String colour, double price, int miles) {
        super("Toyota", model, year, colour, price, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    public void start(){
        System.out.println("Twist the key in ignition to start "+brand+" "+model);
    }

}
