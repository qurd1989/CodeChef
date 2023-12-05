package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ApplesAndOranges {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int val = solve(n,m);

            System.out.println(val);
        }
    }
    public static int solve(int n, int m){

        if (m==0){
            return n;
        }else
            return solve(m, n % m);
    }

}
