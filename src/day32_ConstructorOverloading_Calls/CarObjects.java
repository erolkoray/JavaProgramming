package day32_ConstructorOverloading_Calls;

public class CarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("BMW");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Mercedes", "CLA", 2018);
        Car car4 = new Car("Toyota", "Auris", 2022, "White");
        Car car5 = new Car("Seat", "Leon", 2014, "Black", 8000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
