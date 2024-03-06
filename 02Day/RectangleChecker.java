/*1. Take values of length and breadth of a rectangle from user and check if it is square or not.*/
import java.util.Scanner;

public class RectangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        if (length == breadth) {
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }
    }
}
