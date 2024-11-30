import java.util.Scanner;

public class WorkingDayOrWeekend {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number (1-7): ");
        try {
            int dayNumber = scanner.nextInt();

            // Determine if it's a Working Day or Weekend
            if (dayNumber >= 1 && dayNumber <= 5) {
                System.out.println("Working Day");
            } else if (dayNumber == 6 || dayNumber == 7) {
                System.out.println("Weekend");
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }

        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
