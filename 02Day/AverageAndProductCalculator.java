/*6. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.*/
import java.util.Scanner;

public class AverageAndProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;

        System.out.println("Enter integers (press 'q' to quit):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                sum += num;
                product *= num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
