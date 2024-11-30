import java.util.Scanner;

class CheckWhetherNumber {
    public static void main(String[] args) {
        CheckWhetherNumbers();
    }

    static void CheckWhetherNumbers() {
        Scanner numberObj = new Scanner(System.in);
        System.out.println("Enter integer number: ");

        int num = numberObj.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("Input Number is Zero");
        }

        numberObj.close();
    }
}
