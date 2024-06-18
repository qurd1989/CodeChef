package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            String str = sc.next();
            int startDay = -1;
            if(str.equals("mon")){startDay = 0;}
            else if(str.equals("tues")){startDay = 1;}
            else if(str.equals("wed")){startDay = 2;}
            else if(str.equals("thurs")){startDay = 3;}
            else if(str.equals("fri")){startDay = 4;}
            else if(str.equals("sat")){startDay = 5;}
            else if(str.equals("sun")){startDay = 6;}

            int count = 0;
            int[] arr = new int[7];

            for(int i=startDay; i<7; i=(i+1)%7){
                arr[i]++;
                count++;

                if(count==n){break;}
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
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
