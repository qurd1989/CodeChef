package begginerDSA;

import java.util.Scanner;

public class PreviewProblem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = gcd(n,m);
            int result = (n/x) * (m/x);
            System.out.println(result);
        }
    }
    public static  int gcd(int n, int m){
        if (m == 0){
            return n;
        }
        return gcd(m, m%n);
    }
}
