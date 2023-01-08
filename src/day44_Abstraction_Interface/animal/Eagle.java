package day44_Abstraction_Interface.animal;

public class Eagle extends Animal implements WildAnimal, Flyable{


    public Eagle(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }


    @Override
    public void hunt() {
        System.out.println(getName() +" hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly at 50mph");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a snake");




    }
}
