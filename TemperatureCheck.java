
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Temperature: ");

        try {
            double temp = scanner.nextDouble();

            if (temp < 0) {
                System.out.println("Very Cold");
            } else if (temp >= 0 && temp <= 15) {
                System.out.println("Cold");
            } else if (temp >= 16 && temp <= 30) {
                System.out.println("Warm");
            } else {
                System.out.println("Hot");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
