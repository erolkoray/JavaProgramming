package day36_Inheritance.animalTask;

public class Dog extends Animal {
    //  Child class    Parent Class

    /*
    Dog class inherited 6 variables and 6 methods from the Animal class
     */
    public void bark(){
        System.out.println(name + " is barking.");
    }

    public void sniffing(){
        System.out.println(name + " is sniffing");
    }



}
