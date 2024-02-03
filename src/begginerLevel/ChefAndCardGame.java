package begginerLevel;

import java.util.Scanner;

public class ChefAndCardGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n =sc.nextInt();
            int chefCount = 0;
            int mortycount = 0;
            for (int i =0; i< n; i++) {
                long  a = sc.nextInt();
                long  b = sc.nextInt();
                long  v = solve(a);
                long  w = solve(b);
                if (v > w){
                    chefCount++;
                }else if (v == w){
                    mortycount++;
                    chefCount++;
                }else
                    mortycount++;
            }

            if (chefCount > mortycount){
                System.out.println(0 + " " + chefCount);
            }else if (chefCount < mortycount){
                System.out.println(1 + " " + mortycount);
            }else
                System.out.println(2 + " " + chefCount);
        }
    }
    public static long solve(long n) {
        long sum = 0;
        while(n!=0){
            long digit = n % 10;
            sum +=digit;
            n/=10;
        }
        return sum;
    }
}
