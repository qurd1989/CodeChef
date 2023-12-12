package begginerLvevelSecondHalf;

import java.util.Scanner;

public class LostWEekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int days[] = new int[5];
            for (int i = 0; i <=4; i++ ){
                days[i] = sc.nextInt();
            }
            int p = sc.nextInt();
            int totalFiveDayHours = 5 *24;
            int sum = 0;

            for(int i= 0; i < 5; i++){
                sum += days[i];
            }

            int totalRequiredWorkingHours = sum * p;

            if(totalFiveDayHours < totalRequiredWorkingHours ){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}

