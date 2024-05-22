package begginerLvevelSecondHalf;

import java.util.Scanner;

public class WeaponValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int cnt = 0;
            String temp1 = sc.next();
            String temp2;

            for (int i = 1; i < N; i++) {
                temp2 = sc.next();
                StringBuilder sb = new StringBuilder(temp2);
                for (int j = 0; j < 10; j++) {
                    if (temp1.charAt(j) != temp2.charAt(j)) {
                        sb.setCharAt(j, '1');
                    } else {
                        sb.setCharAt(j, '0');
                    }
                }
                temp1 = sb.toString();
            }

            for (int i = 0; i < 10; i++) {
                if (temp1.charAt(i) == '1') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}