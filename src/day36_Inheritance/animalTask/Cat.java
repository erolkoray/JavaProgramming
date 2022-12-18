package day36_Inheritance.animalTask;

public class Cat extends Animal{ // is a relationship = Cat Is An Animal

    // Cat class has inherited 6 variables and 6 methods from the Animal class

    public void meowing(){
        System.out.println(name + " is meowing.");
    }

    public void scratch(){
        System.out.println(name+" is scratching.");
    }

    public void catInfo(){
        System.out.println(name+" is a "+breed+"."+" It is a "+gender+" and it is "+age+" years old.");
    }


}
