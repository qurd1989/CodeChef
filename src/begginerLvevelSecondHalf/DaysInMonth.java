package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int w = sc.nextInt();
            String s = sc.next();

        }

    }
    public static String toLowerCase(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
                sb.append(c);
            }else
                sb.append(c);
        }

        return new String(sb);
    }


    public static boolean isPerfectSquare(long n) {
        long low = 1;
        long high = n;

        while (low <= high){
            long mid = high + (high -low) /2;
            if (mid * mid == n){
                return true;
            }else if (mid * mid < n){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return false;
    }

}
