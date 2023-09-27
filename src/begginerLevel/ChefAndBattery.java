package begginerLevel;

import java.util.Scanner;

public class ChefAndBattery {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();

            int ans =0;
            while (n != 50) {
                 if (n < 50) {
                     n = n+2;
                 }else
                     n = n -3;

                 ans++;
            }
            System.out.println(ans);
        }

    }
}
