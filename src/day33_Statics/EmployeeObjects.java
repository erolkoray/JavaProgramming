package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        // code below will all print "Cydeo" because the name declared in the

        Employee employee1 = new Employee();
        employee1.name= "Koray";
        employee1.salary = 115000;
        employee1.isHuman = true;

        Employee employee2 = new Employee();
        employee2.name = "Rose";
        employee2.salary = 140000;
        Employee employee3 = new Employee();
        employee3.name = "Cydeo";
        employee3.salary = 125000;


        System.out.println("employee3 = " + employee3.name +" "+ employee1.salary);
        System.out.println("employee2 = " + employee2.name +" "+ employee1.salary);
        System.out.println("employee1 = " + employee1.name +" "+ employee1.salary);
        System.out.println();

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);
    }

}
