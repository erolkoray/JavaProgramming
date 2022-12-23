package day39_Encapsulation_Inheritance_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, int salary, String jobTitle) {
        super(name, age, gender, employeeID, salary, jobTitle);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName() + " is creating a ticket.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName() + " is testing the application.");
    }
}
/*
3. Create a sub class of Employee named Tester
            Override the work method
            Extra methods:
                createTicket()
 */