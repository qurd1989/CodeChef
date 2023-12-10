package begginerLvevelSecondHalf;

import java.util.Scanner;

public class MinimumAttendanceRequirement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0 ){
            int n = sc.nextInt();
            String s = sc.next();
            int ones = 0;
            int zeros = 0;
            for (int i =0; i< n-1; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }
                zeros = Math.abs(n -1 - ones);
            if (ones+(120-n) >=90){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
