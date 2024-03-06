/*5. Write a program to find the sum and product of all elements of an array.*/
public class ArraySumProduct {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}


