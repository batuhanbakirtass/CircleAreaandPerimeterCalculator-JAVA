import java.util.Scanner;

public class CircleAreaandPerimeterCalculator {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        r = inp.nextInt();
        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

        // program to find the area of a circle
        System.out.println("Enter the measure of the central angle: ");
        double angle = inp.nextDouble();
        double segmentArea = (pi * r * r * angle) / 360;
        System.out.println("Area of the circle segment: " + segmentArea);
    }
}
