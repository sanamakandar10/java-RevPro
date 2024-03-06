/*8. Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum diff=higest-lowest
minimum diff=second lowest - lowest*/
import java.util.Arrays;
public class MaxMinDifference {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        Arrays.sort(array);
        int minDiff=array[1]-array[0];
        int maxDiff=array[array.length-1]-array[0];

        System.out.println("Pair with minimum difference: " + array[0] + " and " + array[1]);
        System.out.println("Pair with maximum difference: " + array[0] + " and " + array[array.length - 1]);
    }
}
