package day43_AbstractionIntro.employee;

public abstract class Employee extends Person{

    private final int ID;
    private String jobTitle;
    private int salary;

    public Employee(String name, int age, char gender, int ID, String jobTitle, int salary) {
        super(name, age, gender);
        this.ID = ID;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getID() {
        return ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary <=0){
            System.out.println("Invalid salary: "+salary);
        }
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
