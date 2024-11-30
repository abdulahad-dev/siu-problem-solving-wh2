import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your weight (in kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height (in meters): ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Weight and height must be positive values.");
                return;
            }

            double bmi = weight / (height * height);

            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                category = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            System.out.printf("BMI: %.1f, Category: %s%n", bmi, category);

        } catch (Exception e) {
            System.out.println("Please enter valid numeric inputs for weight and height.");
        } finally {
            scanner.close();
        }
    }
}
