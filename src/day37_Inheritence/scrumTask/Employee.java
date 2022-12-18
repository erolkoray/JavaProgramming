package day37_Inheritence.scrumTask;

public class Employee extends Person{

    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary= £" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
    public void work(){
        System.out.println(name+" ("+jobTitle+") is working");
    }
}
