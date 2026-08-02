import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area of rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double rectangleArea = length * width;

        // Area of triangle
        System.out.print("\nEnter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double triangleArea = 0.5 * base * height;

        // Area of circle
        System.out.print("\nEnter the radius of the circle: ");
        double radius = input.nextDouble();

        double circleArea = Math.PI * radius * radius;

        // Displaying results
        System.out.println("\nArea of rectangle = " + rectangleArea);
        System.out.println("Area of triangle = " + triangleArea);
        System.out.println("Area of circle = " + circleArea);

        input.close();
    }
}