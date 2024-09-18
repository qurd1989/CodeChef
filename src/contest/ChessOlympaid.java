package contest;

import java.util.Scanner;

public class ChessOlympaid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        double ourPoints = X * 1.0 + Y * 0.5;
        double opponentPoints = Z * 1.0 + Y * 0.5;

        // Calculate remaining games
        int remainingGames = 4 - (X + Y + Z);

        // Calculate maximum possible points for our team (if we win all remaining games)
        double ourMaxPoints = ourPoints + remainingGames * 1.0;

        // Compare our max points to opponent's current points
        if (ourMaxPoints > opponentPoints) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}