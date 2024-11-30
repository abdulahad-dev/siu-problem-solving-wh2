
import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the second side: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the third side: ");
        int side3 = scanner.nextInt();

        if (isValidTriangle(side1, side2, side3)) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("The given sides cannot form a triangle.");
        }
        scanner.close();
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
