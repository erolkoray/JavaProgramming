package day43_AbstractionIntro.employee;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, String jobTitle, int salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 5 hours a night");
    }

    public void coding(){
        System.out.println(getName()+" is coding");
    }
}
