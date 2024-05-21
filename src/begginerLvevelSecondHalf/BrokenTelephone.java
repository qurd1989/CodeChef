package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BrokenTelephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int result[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++){
                result[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if ((i > 0 && result[i] != result[i - 1]) || (i < n - 1 && result[i] != result[i + 1])) {
                    count++;
                }

            }
            System.out.println(count);
        }

    }
}
