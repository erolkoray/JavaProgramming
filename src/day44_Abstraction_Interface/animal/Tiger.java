package day44_Abstraction_Interface.animal;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts impalas");
    }
}
