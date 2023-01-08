package day44_Abstraction_Interface.animal;

public class Parrot extends Animal implements Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating bird food");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly at 20mph");
    }
}
