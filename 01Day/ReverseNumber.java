/*10. Write a program to reverse a 3-digit number. 
E.g.-Number : 132        Output : 231
Input the number using scanner.*/
import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int number=scanner.nextInt();
        
        int reversedNumber=0;
        
        while (number!=0) {
            int digit=number%10;
            reversedNumber=reversedNumber*10+digit;
            number/=10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}