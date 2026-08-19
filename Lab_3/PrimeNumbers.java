// Write a java program to find all prime numbers from 1 to N. Take N as user input.

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}