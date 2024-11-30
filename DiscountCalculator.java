import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");

        try {
            double purchaseAmount = scanner.nextDouble();
            double discountedPrice;

            if (purchaseAmount < 100) {
                discountedPrice = purchaseAmount;
                System.out.println("No discount applied.");
            } else if (purchaseAmount <= 500) {
                discountedPrice = purchaseAmount - (purchaseAmount * 0.10);
                System.out.println("10% discount applied.");
            } else {
                discountedPrice = purchaseAmount - (purchaseAmount * 0.20);
                System.out.println("20% discount applied.");
            }

            System.out.printf("Discounted price: %.2f%n", discountedPrice);

        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
