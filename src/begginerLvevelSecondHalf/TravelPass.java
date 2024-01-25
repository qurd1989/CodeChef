package begginerLvevelSecondHalf;

import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            int zeroCounts = 0;
            int oneCounts = 0;

            for (int i = 0; i < n; i++){
                if (s.charAt(i) == '1'){
                    oneCounts++;
                }else
                    zeroCounts++;
            }

            System.out.println((a * zeroCounts) + (b * oneCounts));
        }
    }
}
