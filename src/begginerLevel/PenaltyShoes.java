package begginerLevel;

import java.util.Scanner;

public class PenaltyShoes {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int[] scores = new int[2]; // Array to store scores of each team

            // Read penalty shootout outcomes
            for (int i = 1; i <= 10; i++) {
                int outcome = scanner.nextInt();
                int team = (i % 2 == 1) ? 0 : 1; // 0 for team 1, 1 for team 2

                if (outcome == 1) {
                    scores[team]++; // Increment score if it's a goal
                }
                // Determine the winner or if it's a draw
                int winner = determineWinner(scores);
                System.out.println(winner);
            }
        }
    }

    private static int determineWinner(int[] scores) {
        // Compare the scores and determine the winner
        if (scores[0] > scores[1]) {
            return 1; // Team 1 wins
        } else if (scores[1] > scores[0]) {
            return 2; // Team 2 wins
        } else {
            return 0; // It's a draw
        }
    }
}
