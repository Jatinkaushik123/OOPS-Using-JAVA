/* Write a java program that prints a menu on the screen as shown below and reads the
option selected by the user. According to the option, the program must read the
corresponding data to perform the selected area calculation. The resulting values must be
printed on the screen.
1. Calculate the area of a triangle (base, height)
2. Calculate the area of a circle (r)
3. Calculate the area of a rectangle (length, width)
4. Exit the program
(Hint: You can use do-while loop and switch case)*/
import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Area Calculator Menu ---");
            System.out.println("1. Calculate the area of a triangle (base, height)");
            System.out.println("2. Calculate the area of a circle (r)");
            System.out.println("3. Calculate the area of a rectangle (length, width)");
            System.out.println("4. Exit the program");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of Triangle: " + triangleArea);
                    break;
                case 2:
                    System.out.print("Enter radius (r): ");
                    double radius = scanner.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Area of Circle: " + circleArea);
                    break;
                case 3:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("Area of Rectangle: " + rectangleArea);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
        scanner.close();
    }
}