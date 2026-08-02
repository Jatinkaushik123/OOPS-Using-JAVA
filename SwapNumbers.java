import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Swapping using a temporary variable
        int temp = first;
        first = second;
        second = temp;

        System.out.println("\nAfter swapping using a temporary variable:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Swap again without using a temporary variable
        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("\nAfter swapping without a temporary variable:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        input.close();
    }
}