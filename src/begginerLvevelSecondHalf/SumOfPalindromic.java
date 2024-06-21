package begginerLvevelSecondHalf;

import java.util.Scanner;

public class SumOfPalindromic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
            for (int i = l; i <= r; i++){
                if (palindrome(i) == true){
                    ans += i;
                }
            }
            System.out.println(ans);
        }
    }
    public static boolean palindrome(int n){
        int original = n;
        int reversed = 0;
        while (n != 0){
            int digit = n % 10;
            reversed = reversed * 10 +digit;
            n/=10;
        }
        return original == reversed;
    }

}
