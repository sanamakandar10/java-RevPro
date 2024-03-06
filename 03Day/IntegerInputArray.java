/*Take 10 integer inputs from user and store them in an array and print them on screen.*/
import java.util.Scanner;
public class IntegerInputArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[10];

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i]=scanner.nextInt();
        }

        System.out.println("The numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}