package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (s.charAt(i) == '>' && s.charAt(i + 1) == '<') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
