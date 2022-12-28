package day43_AbstractionIntro.car;

public final class Honda extends Car{

    //IF A CLASS EXTENDS TO ANOTHER CLASS, IT HAS TO INHERIT THE VARIABLES BY CONSTRUCTOR

    public Honda(String model, String colour, int year, double price) {
        super("Honda", model, colour, year, price);
    }

    // IF THERE IS AN ABSTRACT METHOD IN PARENT CLASS, IT IS MANDATORY FOR CHILD CLASS TO COMPLETE IT.

    public void start() {   // this method got inherited from Car class without the abstract keyword. So it is not an abstract method.
        System.out.println("Twist the key to ignite and start the car");
    }






}
