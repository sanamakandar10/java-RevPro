/*1. Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.*/

public class O1Day Assignment01 {
	public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Please provide the length and breadth as command line arguments.");
            return;
}
        int length =Integer.parseInt(args[0]);
        int breadth =Integer.parseInt(args[1]);
        int area=length*breadth;
        int perimeter=2*(length+breadth);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
}
}