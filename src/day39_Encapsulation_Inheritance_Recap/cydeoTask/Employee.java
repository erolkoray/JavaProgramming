package day39_Encapsulation_Inheritance_Recap.cydeoTask;

public class Employee extends Person{

    private int employeeID, salary;
    private String jobTitle;



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    } // YOU CAN ADD CONDITIONS TO THESE GETTERS AND SETTERS AS YOU WISH. eg. SALARY CAN'T BE 0

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, char gender, int employeeID, int salary, String jobTitle) {
        super(name, age, gender);
        setEmployeeID(employeeID); // WE ARE USING SETTER IN CONSTRUCTORS SO WE CAN ADD CONDITIONS TO THE SETTERS IF REQUIRED.
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}




/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:
                work()
                toString()
 */