/*6. Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3].*/
public class PerfectNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            if (Perfect(number)) {
              System.out.println(number + " is a perfect number.");
          }
       }
    }

    public static boolean Perfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
          if (number % i == 0) {
            sum += i;
           }
        }
        return sum == number;
    }
}

