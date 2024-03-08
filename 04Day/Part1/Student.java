/*2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.*/
class Student {
    String name;
    int roll_no;
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.roll_no = 2;

        System.out.println("Student 1 - Name: " + student1.name + ", Roll No: " + student1.roll_no);
        Student student2 = new Student();
        student2.name = "Sam";
        student2.roll_no = 1;

        System.out.println("Student 2 - Name: " + student2.name + ", Roll No: " + student2.roll_no);
    }
}