package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TruthTellerAndLiars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n > m){
                System.out.println(2 * m +1);
            }else {
                System.out.println(-1);
            }
        }
    }
}
