package begginerLevel;

import java.util.Scanner;

public class TheOldSaintAndThreeQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t--> 0) {
                int hero[] = new int[3];
                int oldSaint[] = new int[3];

                int countOnesforHero = 0;
                int countOnesForOldSaint = 0;
                for (int i = 0; i < 3; i++) {
                    hero[i] = sc.nextInt();
                    if (hero[i] == 1) {
                        countOnesforHero++;
                    }
                }
                for (int i = 0; i < 3; i++) {
                    oldSaint[i] = sc.nextInt();
                    if (oldSaint[i] == 1) {
                        countOnesForOldSaint++;

                    }
                }
                if (countOnesforHero == countOnesForOldSaint) {
                    System.out.println("Pass");
                } else
                    System.out.println("Fail");
            }
    }
}
