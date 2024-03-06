/*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.*/

import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            originalArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

        System.out.println("Elements in the reversed array:");

        for (int i = 0; i < 10; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}