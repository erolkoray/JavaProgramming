package day32_ConstructorOverloading_Calls;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Koray");

        System.out.println(employee1);

        Employee employee2 = new Employee("Koray", 'M');

        System.out.println(employee2);

        Employee employee3 = new Employee("Koray", 'M', "Head of Licensing");

        System.out.println(employee3);

        Employee employee4 = new Employee("Koray", 'M', "Head of Licensing", 56000);

        System.out.println(employee4);

    }
}
