/*1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.*/
import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);
        
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        
        scanner.close();
    }
    public static int findMax(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        return max;
    }
    public static int findMin(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        return min;
  }
}