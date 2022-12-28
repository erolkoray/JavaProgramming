package day43_AbstractionIntro.employee;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, String jobTitle, int salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    public void sleep() {
        System.out.println(getName()+" is up all night creating automation programs");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
