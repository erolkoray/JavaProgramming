package day38_Method_Overriding.carTask;

public class Car {

    public String brand, model;
    public int year;
    public String colour;
    public double price;
    public int miles;

    public Car(String brand, String model, int year, String colour, double price, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", price= £" + price +
                ", miles=" + miles +
                '}';
    }
}
