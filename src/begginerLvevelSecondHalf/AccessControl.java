package begginerLvevelSecondHalf;

import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            int access = 0;
            boolean isValid = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    access--;
                } else {
                    access = x;
                }
                if (access < 0) {
                    System.out.println("No");
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println("Yes");
            }
        }
    }
}
