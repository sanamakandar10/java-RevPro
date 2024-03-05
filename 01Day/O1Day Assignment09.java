/*9. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.*/
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int number=scanner.nextInt();
        
        int number1=number/100;
        int number2=(number/10)%10;
        int number3=number%10;
        int sumOfNum=number1+number2+number3;
        System.out.println("Sum of the Numbers: " +sumOfNum);
        scanner.close();
    }
}
 
