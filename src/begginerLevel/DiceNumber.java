package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

public class DiceNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

           int alice = 0, bob = 0;
           int aliceArr[] = new int[3];
           int bobArr[] = new int[3];

           for (int i = 0; i < 5;  i++) {
               int x = sc.nextInt();
               if (i < 3) {
                   aliceArr[i] = x;
               }else
                   bobArr[i%3] = x;
           }

            Arrays.sort(aliceArr);
            Arrays.sort(bobArr);
            for (int i = 3; i>0; i++){
                alice *= 10;
                alice += aliceArr[i-1];
            }
            for (int i = 3; i > 0; i++){
                bob  *= 10;
                bob += bobArr[i-1];
            }

            solve(alice, bob);
        }
    }

    public static  void solve(int a, int b){
        if (a > b){
            System.out.println("Alice");
        }else if (a < b) {
            System.out.println("Bob");
        }else
            System.out.println("Tie");
    }
}
