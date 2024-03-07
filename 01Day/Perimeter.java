cm/*2. Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments.*/

public class Perimeter {
	public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide the three sides of the triangle as command line arguments.");
            return;
}
        int side1=Integer.parseInt(args[0]);
        int side2=Integer.parseInt(args[1]);
        int side3=Integer.parseInt(args[2]);
        double perimeter=side1+side2+side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
}
}
