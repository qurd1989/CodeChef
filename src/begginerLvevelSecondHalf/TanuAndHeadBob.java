package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TanuAndHeadBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n =sc.nextInt();
            String s = sc.next();
            char c[] = s.toCharArray();
            int countY = 0;
            int countN = 0;
            for (int i=0; i < n; i++) {
                if (c[i] == 'I') {
                    countN++;
                } else if (c[i] == 'Y'){
                    countY++;
                }else{
                    continue;
                }

            }
            if (countY  !=0) {
                System.out.println("NOT INDIAN");
            }else if (countN != 0) {
                System.out.println("INDIAN");
            }else
                System.out.println("NOT SURE");
        }

    }
}

