import java.util.Scanner;

public class StudentRankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        try {
            int score = scanner.nextInt();

            String rank;
            if (score >= 90) {
                rank = "Top Rank";
            } else if (score >= 75) {
                rank = "Second Rank";
            } else if (score >= 50) {
                rank = "Third Rank";
            } else {
                rank = "No Rank";
            }

            System.out.println(rank);

        } catch (Exception e) {
            System.out.println("Please enter a valid numeric score.");
        } finally {
            scanner.close();
        }
    }
}
