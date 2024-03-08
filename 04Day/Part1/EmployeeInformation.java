/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994              64C- WallsStreet
Sam               2000              68D- WallsStreet
John              1999              26B- WallsStreet*/
class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void printInformation() {
        System.out.println(name + "\t" + yearOfJoining + "\t\t" + address);
    }
}

public class EmployeeInformation {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet");

        System.out.println("Name\t\tYear of joining\tAddress");
        employee1.printInformation();
        employee2.printInformation();
        employee3.printInformation();
    }
}