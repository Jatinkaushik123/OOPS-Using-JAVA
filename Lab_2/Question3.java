import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = sc.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade");
        }
        else if (grade == 100) {
            System.out.println("Perfect Score");
        }
        else {

            switch (grade / 10) {

                case 9:
                    System.out.println("Excellent");
                    break;

                case 8:
                    System.out.println("Good");
                    break;

                case 7:
                    System.out.println("Above Average");
                    break;

                case 6:
                    System.out.println("Average");
                    break;

                case 5:
                    System.out.println("Below Average");
                    break;

                default:
                    System.out.println("Not Passing");
            }
        }
    }
}