package day43_AbstractionIntro.employee;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int ID, String jobTitle, int salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps for 8 hours each night");
    }
}
