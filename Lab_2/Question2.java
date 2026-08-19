import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double revenue = price * quantity;
        double discount = 0;

        if (quantity < 100) {
            discount = 0;
        }
        else if (quantity <= 120) {
            discount = revenue * 0.10;
        }
        else {
            discount = revenue * 0.15;
        }

        double finalRevenue = revenue - discount;

        System.out.println("Revenue from sale: " + revenue);
        System.out.println("Discount: " + discount);
        System.out.println("After discount: " + finalRevenue);
    }
}