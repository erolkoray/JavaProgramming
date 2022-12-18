package day38_Inheritence.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, String colour, double price, int miles) {
        super("Toyota", model, year, colour, price, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", price= £" + price +
                ", miles=" + miles +
                '}';
    }
}
