package day32_ConstructorOverloading_Calls;

public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String colour;

    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String model){
        this(brand);
        this.model = model;
    }
    public Car(String brand, String model, int year) {
        this(brand,model);
        this.year = year;
    }
    public Car(String brand, String model, int year, String colour){
        this(brand, model, year);
        this.colour = colour;
    }
    public Car(String brand, String model, int year, String colour, double price){
        this(brand, model, year, colour);
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= £" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
class name: Car
	 instance variables:
		 	make, model, year, price, color

 	1st constructor: initializes the make ONLY

 	2nd constructor: initializes make & model
 		(MUST use constructor call to set the make)

	3rd constructor: initializes make, model, year
		(MUST use constructor call to set the make, model)

	4th constructor: initializes make, model, year, price
		(MUST use constructor call to set the make, model, year)

	5th Constructor: intializes all the instances
		(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString
 */