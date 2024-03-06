/*4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/
import java.util.Scanner;

public class 01Day Assignment04 {
	public static void main(String[] args) {
        Scanner scanner=newScanner(System.in);
        
        System.out.print("Enter the marks for subject 1: ");
        int marks1=scanner.nextInt();
        
        System.out.print("Enter the marks for subject 2: ");
        int marks2=scanner.nextInt();
        
        System.out.print("Enter the marks for subject 3: ");
        int marks3=scanner.nextInt();
        
        int totalMarks=marks1+marks2+marks3;
        double percentage=(totalMarks/300.0)*100;
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage marks: " + percentage + "%");
}
}
