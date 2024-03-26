package begginerLvevelSecondHalf;

import java.util.Scanner;

public class LittleElephantAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        while (k--> 0){
            String subString = sc.next();
            int flag = 0;
            if (subString.length() >= 47) {
                flag = 1;
            } else {
                for (int j = 0; j < n; j++) {
                    if (subString.contains(String.valueOf(s[j]))) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}


