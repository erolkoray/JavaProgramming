package day43_AbstractionIntro.car;

public class CarShop {

    public static void main(String[] args) {

        Car car1 = new Car("m","a","e",2000, 28500) {
            public void start() {
                System.out.println("push the button!");
            }
        };
        //Brand, Model and Year were set as Final in Car class, so once we set them, they cannot be changed. Meaning, those data cannot be overridden/changed.

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------------------------------------");

        honda.setColour("Red");
        audi.setColour("Pink");
        tesla.setColour("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }


}
