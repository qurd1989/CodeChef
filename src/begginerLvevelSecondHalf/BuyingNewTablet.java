package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BuyingNewTablet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            // Chef budget is B
            // N number of tables available
            int n = sc.nextInt();
            int b = sc.nextInt();
            int maxArea = 0;
            for (int i = 0; i<n; i++){
                int w = sc.nextInt();
                int h = sc.nextInt();
                int p = sc.nextInt();

                if (p <= b){
                    int max = w * h;
                    if (max > maxArea) {
                        maxArea = max;
                    }
                }
            }
            if (maxArea == 0) {
                System.out.println("No tablet");
            }else
                System.out.println(maxArea);
        }
    }
}
