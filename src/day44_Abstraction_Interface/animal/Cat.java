package day44_Abstraction_Interface.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating lasagna");
    }


}
