/*3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/
public class Calculate {
	public static void main(String[] args) {
        int number = 2345;
        int result = ((number+8)/3)%5*5;
        System.out.println("Final result: " + result);
    }
}

