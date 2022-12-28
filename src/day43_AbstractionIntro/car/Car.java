package day43_AbstractionIntro.car;

public abstract class Car { // ABSTRACT METHOD CANNOT BE FINAL OR PRIVATE. ABSTRACT IS MEANT TO BE OVERRIDDEN.
                            // You can't add a body to an ABSTRACT METHOD.
                            // ABSTRACT CLASS IS A PARENT CLASS.
                            // YOU CANNOT CREATE AN OBJECT FROM AN ABSTRACT CLASS - Object: Car car1 = new Car;

    private final String brand, model;
    private String colour;
    private final int year;
    private double price;

    public Car(String brand, String model, String colour, int year, double price) {
        this.brand = brand;  // this method is a FINAL method (above) so you can't create a SETTER for it. Because it cannot be changed.
        this.model = model;  // this method is a FINAL method (above) so you can't create a SETTER for it. Because it cannot be changed.
        setColour(colour);
        if(year < 1886){     // If there is no SETTER for the data because its FINAL, then you need to give the condition in the constructor
            throw new RuntimeException("Invalid year: "+year);
        }
        this.year = year;    // this method is a FINAL method (above) so you can't create a SETTER for it. Because it cannot be changed.
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public abstract void start(); //No body can be provided to this method because it's an abstract method. It will be overridden in subclasses.

    public void stop(){
        System.out.println("Press the break");
    } // body is provided in this method, so it cannot be an abstract method.
}
