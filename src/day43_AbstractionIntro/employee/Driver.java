package day43_AbstractionIntro.employee;

public final class Driver extends Employee{


    public Driver(String name, int age, char gender, int ID, String jobTitle, int salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps for 10 hours each night");
    }

}
