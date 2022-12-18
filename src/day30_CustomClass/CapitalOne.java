package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        Employee employee2 = new Employee();
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        Employee employee3 = new Employee();
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        Employee employee4 = new Employee();
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        Employee employee5 = new Employee();
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};



        int countFullTime = 0,
                countPartTime=0;

        double max = employees[0].salary;
        double min = employees[0].salary;


        for (Employee employee : employees) {
            if(employee.isFullTime == true){
                countFullTime++;
            }else {
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }

            if(employee.salary < min){
                min = employee.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);

        System.out.println("min salary = " + min);
        System.out.println("max salary = " + max);



/*
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));

         employees.removeIf(p -> p.isFullTime == true);
        System.out.println(employees.size());

 */


    }

}
/*
CapitalOne Class:

	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */