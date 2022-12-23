package day39_Encapsulation_Inheritance_Recap.cydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeID, int salary, String jobTitle) {
        super(name, age, gender, employeeID, salary, jobTitle);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching.");
    }
}
/*
5. Create a sub class of Employee named Teacher
            Override the work method
 */