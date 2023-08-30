package begginerLevel;

import java.util.Scanner;

public class IDOfShip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            char a = sc.next().charAt(0);

            if (a == 'd' || a == 'D') {
                System.out.println("Destroyer");
            }else if (a == 'b' || a == 'B') {
                System.out.println("BattleShip");
            }else if (a == 'c' || a == 'C') {
                System.out.println("Cruiser");
            }else System.out.println("Frigate");
        }
    }
}
