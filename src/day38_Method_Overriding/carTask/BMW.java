package day38_Method_Overriding.carTask;

public class BMW extends Car{

    public BMW(String model, int year, String colour, double price, int miles) {
        super("BMW", model, year, colour, price, miles);
    }

    public void breakdown(){
        System.out.println(brand+" "+model+" has broken down");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

    public void start(){
        System.out.println("Call the mechanic to jump start "+brand+" "+model);
    }
}
