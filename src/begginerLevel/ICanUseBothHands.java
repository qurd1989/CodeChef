package begginerLevel;

import java.util.Scanner;

public class ICanUseBothHands {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int m = sc.nextInt();
            int totalPage =  (m/r) + (m/l);

            if (m % l != 0){
                totalPage++;
            }
            System.out.println(totalPage);
        }
    }
}
