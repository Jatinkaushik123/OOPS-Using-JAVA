import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        if (students <= 0) {
            System.out.println("Number of students must be greater than zero.");
            return;
        }

        double total = 0;
        int countA = 0;

        for (int i = 1; i <= students; i++) {

            System.out.print("Enter grade of student " + i + ": ");
            double grade = sc.nextDouble();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade");
                i--;
                continue;
            }

            total = total + grade;

            if (grade >= 90) {
                System.out.println("Grade: A");
                countA++;
            }
            else if (grade >= 80) {
                System.out.println("Grade: B");
            }
            else if (grade >= 70) {
                System.out.println("Grade: C");
            }
            else if (grade >= 60) {
                System.out.println("Grade: D");
            }
            else {
                System.out.println("Grade: F");
            }
        }

        double average = total / students;

        System.out.println("Average grade = " + average);
        System.out.println("Number of students with A grade = " + countA);
    }
}