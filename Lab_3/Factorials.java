// Write a java program to print the factorial of the numbers from 1 to 10. To calculate the factorial value, use the while loop.

public class Factorials {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10) {
            long fact = 1;
            int i = 1;

            // Calculate factorial of the current number using while loop
            while (i <= num) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial of " + num + " = " + fact);
            num++;
        }
    }
}