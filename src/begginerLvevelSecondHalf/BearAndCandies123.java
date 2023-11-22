package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BearAndCandies123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i= 1;
            String ans = "";

            while (true){
                if (i * i > a) {
                    ans = "Bob";
                    break;
                }
                if (i * (i +1) > b) {
                    ans = "Limak";
                    break;
                }
                i++;
            }

            System.out.println(ans);
        }

    }
}
