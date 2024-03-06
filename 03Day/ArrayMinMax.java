/*7. Find largest and smallest elements of an array.*/
import java.util.Arrays;
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        Arrays.sort(array);
        int smallest = array[0];
        int largest = array[array.length - 1];

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}