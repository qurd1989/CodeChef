package begginerLevel;

import java.util.Scanner;

public class ChefAndFruits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int x = Math.abs(n - m);
            if (x <= k){
                System.out.println(0);
            }else
                System.out.println(x - k);
        }
    }
}
