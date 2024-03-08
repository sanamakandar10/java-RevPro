/*1. Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.*/
import java.util.Date;

class Employee {
    private String name;
    private double salary;
    private Date dateOfJoining;

    public Employee(String name, double salary, Date dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        
        employees[0] = new Employee("John Doe", 5000.0, new Date());
        employees[1] = new Employee("Jane Smith", 6000.0, new Date());
	employees[1] = new Employee("Allen", 6000.0, new Date());
	employees[1] = new Employee("Anuj Patil", 6000.0, new Date());
	employees[1] = new Employee("Anuja Patil", 6000.0, new Date());
	employees[1] = new Employee("Amit Rav", 6000.0, new Date());
	employees[1] = new Employee("Jasdhir Singh", 6000.0, new Date());
	employees[1] = new Employee("Sana M", 6000.0, new Date());
	employees[1] = new Employee("Heena MS", 6000.0, new Date());

        
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + " details:");
            employees[i].displayDetails();
            System.out.println();
        }
    }
}