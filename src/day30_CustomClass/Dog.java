package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String colour;


    public void setInfo(String dogName,String dogBreed,char dogGender,String dogSize,int dogAge,String dogColour){
        name = dogName;
        breed = dogBreed;
        gender = dogGender;
        age = dogAge;
        colour = dogColour;
        size = dogSize;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}

/*
Attributes:
        name, age, gender, breed, size, colour




Actions:
        eat(), sleep(), play(), bark(), ...



 */