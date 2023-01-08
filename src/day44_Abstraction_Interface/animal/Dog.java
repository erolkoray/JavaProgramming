package day44_Abstraction_Interface.animal;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats pizza");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }



}
