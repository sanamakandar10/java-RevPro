/*2. Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.*/
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 8;
        int numSubjects = 3;
        int[][] marks = new int[numStudents][numSubjects];
        int[] rollNumbers = new int[numStudents];

            for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += marks[i][j];
            }
            double average = sum / (double) numSubjects;
            System.out.println("Roll number: " + rollNumbers[i]);
            System.out.println("Average marks: " + average);
            System.out.println();
        }
    }
}