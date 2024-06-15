package begginerLvevelSecondHalf;

import java.util.Scanner;

public class WeaponChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            double H = sc.nextInt();
            double X = sc.nextInt();
            double Y1 = sc.nextInt();
            double Y2 = sc.nextInt();
            double K = sc.nextInt();

            double a = H/X;
            double only_x = Math.ceil(a);

            double b = H - (Y1*K);
            double only_y = 0;
            if(b <= 0){
                double x = H/Y1;
                only_y = Math.ceil(x);
            }else if(b > 0){
                double x = b/Y2;
                only_y = Math.ceil(x+K);
            }

            if(only_y > only_x){
                System.out.println((int)only_x);
            }else{
                System.out.println((int)only_y);
            }

            t--;
        }

    }
}
