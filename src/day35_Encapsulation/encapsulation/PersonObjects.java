package day35_Encapsulation.encapsulation;

import java.util.Arrays;

public class PersonObjects {
    public static void main(String[] args) {



        Person p1 = new Person();
        p1.setName("Daniel");
        p1.setAge(130);

        Person p2 = new Person();
        p2.setName("Koray");
        p2.setAge(29);


        System.out.println(p1.getName()+" = "+p1.getAge());
        System.out.println(p2.getName()+" = "+p2.getAge());

    }
}
