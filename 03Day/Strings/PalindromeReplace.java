/*5. Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.*/
import java.util.Scanner;

public class PalindromeReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                words[i] = "*".repeat(words[i].length());
            }
        }
        String output = String.join(" ", words);
        System.out.println(output);
    }
    public static boolean isPalindrome(String word) {
        String reversed = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }
}

