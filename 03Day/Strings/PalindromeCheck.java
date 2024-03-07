/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.*/
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = "";
        
        for (int i = input.length()-1;i>= 0;i--){
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}