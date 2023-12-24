package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DigitsSumParities {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {

            int n = sc.nextInt();
            int x = n+1;
            if (solve(n) == solve(x )){
                x++;
            }
            System.out.println(x);
        }

    }
    public static int solve(int n) {
        int res= 0;
        while (n != 0){
            res = n%10;
             n= n/10;
        }
        return res;
    }

}
