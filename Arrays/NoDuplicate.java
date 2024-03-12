import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num;
                do {
                    System.out.print("Please enter element at position (" + (i+1) + "," + (j+1) + "): ");
                    num = sc.nextInt();
                } while (numbers.contains(num));
                array[i][j] = num;
                numbers.add(num);
            }
        }
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}