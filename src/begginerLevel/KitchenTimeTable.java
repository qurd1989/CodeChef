package begginerLevel;

import java.util.Scanner;

public class KitchenTimeTable {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cookCompleteTime[] = new int[n];
            int cookStartTime[] = new int[n];
            int count = 0;
            for (int i = 0; i < n;i++){
                cookCompleteTime[i] = sc.nextInt();
            }
            for (int i = 0; i < n;i++){
                cookStartTime[i] = sc.nextInt();
            }
            if (cookCompleteTime[0] >= cookStartTime[0]) {
                count++;
            }

            for (int i = 1; i < n; i++) {
                if (cookCompleteTime[i] - cookCompleteTime[i - 1] >= cookStartTime[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}