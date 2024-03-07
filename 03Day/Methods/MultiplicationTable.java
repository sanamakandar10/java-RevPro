/*3. Print the multiplication table of 15 using recursion.*/
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 15;
        printMultiplicationTable(number, 1);
    }
    public static void printTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1);
        }
    }
}
