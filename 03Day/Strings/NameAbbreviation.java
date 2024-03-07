/*2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/
import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        StringBuilder abbreviation = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                abbreviation.append(names[i]);
            } else {
                abbreviation.append(names[i].charAt(0)).append(".");
            }
        }
        System.out.println("Abbreviation: " + abbreviation);
    }
}
 
