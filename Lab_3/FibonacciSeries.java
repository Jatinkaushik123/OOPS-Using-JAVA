// Write a java program to print the first 50 Fibonacci numbers

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 50;
        long first = 0;
        long second = 1;

        System.out.println("First 50 Fibonacci numbers:");

        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");

            // Calculate next term
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}