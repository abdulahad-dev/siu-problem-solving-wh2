import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");

        try {
            double income = scanner.nextDouble();
            double tax;

            if (income <= 10000) {
                tax = 0; // No tax
            } else if (income >= 10001 && income <= 50000) {
                tax = (income * 10) / 100;
            } else {
                tax = (income * 20) / 100;
            }

            System.out.printf("Tax: %.2f%n", tax);

        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
