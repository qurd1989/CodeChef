package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EvenSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
//            int n = sc.nextInt();
//            int arr[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
            String s = sc.next();
            System.out.println(isValid(s) ? "YES" : "NO");
        }
    }

    public static boolean isValid(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            if (s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }

}
