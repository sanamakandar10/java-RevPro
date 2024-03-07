/*Find the area and perimeter of traingle using command line arguments.*/
public class Triangle {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide three command line arguments: side1, side2, side3");
            return;
        }
        double side1 = Double.parseDouble(args[0]);
        double side2 = Double.parseDouble(args[1]);
        double side3 = Double.parseDouble(args[2]);

        double perimeter = side1 + side2 + side3;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}