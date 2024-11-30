import java.util.Scanner;

public class CharacterCaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");

        try {
            char character = scanner.next().charAt(0);

            if (Character.isUpperCase(character)) {
                System.out.println(character + " is uppercase");
            } else if (Character.isLowerCase(character)) {
                System.out.println(character + " is lowercase");
            } else {
                System.out.println("Invalid input. Please enter an alphabetic character.");
            }
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid character.");
        } finally {
            scanner.close();
        }
    }
}
