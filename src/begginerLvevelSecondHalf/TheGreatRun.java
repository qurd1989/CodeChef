package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TheGreatRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int max = 0;
            int[] girls = new int[n];
            for (int i = 0; i < n; i++){
                girls[i] = sc.nextInt();
            }

            // Initial sum for the first window of size K
            int currentImpressed = 0;
            for (int i = 0; i < k; i++) {
                currentImpressed += girls[i];
            }
            max = currentImpressed;

            // Slide the window across the array
            for (int i = k; i < n; i++) {
                System.out.println(currentImpressed);
                System.out.println(girls[i - k]);
                System.out.println(girls[i]);
                currentImpressed = currentImpressed  - girls[i - k] + girls[i];
                max = Math.max(max, currentImpressed);
            }

            System.out.println(max);
        }
        sc.close();
    }
}