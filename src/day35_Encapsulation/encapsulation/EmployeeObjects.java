package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Koray",'M', 29, 56000);

        System.out.println(employee1);

        employee1.setAge(34);
        employee1.setGender('F');

        System.out.println(employee1);

        Employee employee2 = new Employee("Rose", 'F', 30, 30000);

        System.out.println(employee2);

        employee2.setAge(150);
        employee2.setSalary(employee2.getSalary() +20400);

        System.out.println(employee2);
    }




}
