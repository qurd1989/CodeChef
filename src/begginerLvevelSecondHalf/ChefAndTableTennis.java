package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndTableTennis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            String s = sc.next();

            int zeros = 0;
            int ones = 0;
            for (int i = 0; i<s.length(); i++){
                if (s.charAt(i) == '1') {
                    ones++;
                }else
                    zeros++;
            }

            if (zeros > ones){
                System.out.println("No");
            }else
                System.out.println("Yes");
        }
    }
}
