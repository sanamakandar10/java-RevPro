/*2.create a class employee having id,name and salary.create constructors,getter ,setters.
In the name class create an array List containing 4 diff employee obj, using Stream API display the details of employee having salary > 400000 ,
Update the emp salary by 25% and display the same,
Convert the names of emp to uppercase and store it in another list named as empNames and display it.*/

package com.revature.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Sana", 500000));
        employees.add(new Employee(2, "Heena", 350000));
        employees.add(new Employee(3, "Allen", 450000));
        employees.add(new Employee(4, "Soyal", 300000));

        // Displaying details of employees with salary > 400000
        List<Employee> highSalaryEmployees = employees.stream().filter(emp -> emp.getSalary() > 400000).collect(Collectors.toList());

        for (Employee emp : highSalaryEmployees) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary());
        }


        // Updating employee's salary by 25% and displaying the updated salary
        for (Employee emp : employees) {
            double updatedSalary = emp.getSalary() * 1.25;
            emp.setSalary(updatedSalary);
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Updated Salary: " + updatedSalary);
        }

        // Converting employee names to uppercase and storing them in another list
        List<String> empNames = employees.stream().map(emp -> emp.getName().toUpperCase()).collect(Collectors.toList());

        // Displaying the uppercase employee names
        System.out.println("Uppercase Employee Names: " + empNames);
    }
}

