package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        System.out.println(car1);

        car1.setInfo("Mercedes", "CLA 200D", "Metalic Silver", 2018, 14500.00);

        System.out.println(car1);


        Car car2 = new Car();

        car2.setInfo("BMW","331is", "Black", 2020, 45000);

        System.out.println(car2);

        Car car3 = new Car();

        car3.setInfo("Audi","Q7", "red", 2019, 40000);

        System.out.println(car3);

        // Car[] cars = {car1,car2,car3};

        System.out.println("---------------------------------------------------------");

        ArrayList<Car> carList= new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2, car3));

        for (Car eachCar : carList) {

            System.out.println(eachCar.brand+" : "+eachCar.price);

        }

        /*
        Recall: BMW 2005 - 2008 and Toyota 1995 - 1997
         */

        carList.removeIf(p -> p.brand.equalsIgnoreCase("BMW") && p.year >= 2005 && p.year <= 2008);
        carList.removeIf(p -> p.brand.equalsIgnoreCase("Toyota") && p.year >= 1995 && p.year <= 1997);

        System.out.println(carList);

    }





}
