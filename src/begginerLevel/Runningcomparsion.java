package begginerLevel;

import java.util.Scanner;

public class Runningcomparsion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] alice = new int[N];

            for (int i = 0; i < N; i++) {
                alice[i] = scanner.nextInt();
            }

            int[] bob = new int[N];

            for (int i = 0; i < N; i++) {
                bob[i] = scanner.nextInt();
            }
            int count = happyDay(N, alice, bob);

            System.out.println(count);
        }
    }
    public static  int happyDay(int n,int aliceDistances[], int bobDistances[]){

        int happyDay = 0;
        for (int i= 0; i < n; i++){
            int aliceDistance = aliceDistances[i];
            int bobDistance = bobDistances[i];

            boolean aliceIsHappy = aliceDistances[i] <= 2*bobDistances[i];
            boolean bobIsHappy = bobDistances[i] <= 2*aliceDistances[i];

            if (aliceIsHappy && bobIsHappy) {
                happyDay++;

            }
        }
        return happyDay;
    }
}
