package day43_AbstractionIntro.employee;

public class EmployeeObjects {

    public static void main(String[] args) { // YOU CAN ONLY CREATE AN OBJECT FROM A NON-ABSTRACT CLASS

        //Person person = new Person("Josh", 35, 'M');     -- PERSON CLASS IS ABSTRACT SO WE CANNOT CREATE AN OBJECT
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00); -- EMPLOYEE  CLASS IS ABSTRACT SO WE CANNOT CREATE AN OBJECT

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
        // developer.bugReport(); - bug report method does not exist in the developer class and it cannot inherit it because Developer class extends to Employee class, not Tester.
        developer.eat();
        developer.coding();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();




    }
}
