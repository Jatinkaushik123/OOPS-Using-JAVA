import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        int largest, secondLargest, smallest;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    largest = a;
                } else {
                    largest = d;
                }
            } else {
                if (c > d) {
                    largest = c;
                } else {
                    largest = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    largest = b;
                } else {
                    largest = d;
                }
            } else {
                if (c > d) {
                    largest = c;
                } else {
                    largest = d;
                }
            }
        }

        // smallest
        if (a < b) {
            if (a < c) {
                if (a < d) {
                    smallest = a;
                } else {
                    smallest = d;
                }
            } else {
                if (c < d) {
                    smallest = c;
                } else {
                    smallest = d;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    smallest = b;
                } else {
                    smallest = d;
                }
            } else {
                if (c < d) {
                    smallest = c;
                } else {
                    smallest = d;
                }
            }
        }

        // second largest
        secondLargest = a;

        if (secondLargest == largest) {
            secondLargest = b;
        }

        if (b > secondLargest && b < largest) {
            secondLargest = b;
        }

        if (c > secondLargest && c < largest) {
            secondLargest = c;
        }

        if (d > secondLargest && d < largest) {
            secondLargest = d;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
        System.out.println("Smallest = " + smallest);
    }
}