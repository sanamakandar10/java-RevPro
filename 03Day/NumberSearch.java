/*2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/

import java.util.Scanner;
public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to search:");

        int searchNumber = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + searchNumber + " is present in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }
    }
}
