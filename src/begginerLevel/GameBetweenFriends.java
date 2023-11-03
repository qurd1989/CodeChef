package begginerLevel;

import java.util.Scanner;

public class GameBetweenFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1;i<=t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a<b){
                a = a + c;
            }
            else{
                b = b + c;
            }

            if (a<b){
                a = a + d;
            }
            else {
                b = b + d;
            }

            if (a>=b){
                System.out.println("N");
            }
            else{
                System.out.println("S");
            }
        }
    }
}