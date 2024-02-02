package begginerLevel;

import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();

            int pairs = 0;
            boolean flag = true;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1) && flag) {

                    pairs++;
                    flag = false;

                } else
                    flag = true;
            }

            System.out.println(pairs);
        }
    }
}
