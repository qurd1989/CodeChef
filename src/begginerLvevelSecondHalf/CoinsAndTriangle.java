package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
        int n = sc.nextInt();

        int h = 1;
        while ((h * (h + 1)/2) < n) {
            h = h + 1;
        }
            if(h * (h + 1) / 2 == n){
                System.out.println(h);
            }else
                System.out.println(h -1);

    }
    }
}
