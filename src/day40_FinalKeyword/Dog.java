package day40_FinalKeyword;

public final class Dog extends Animal {

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }


    // public void drink(){xxxx } this gives compile error because drink method is final in the Animal class which the Dog class extends to, so it cannot be overriden.

    public void bark(){
        System.out.println(getName() + " is barking");
    }

}
