package arrays;

import javax.swing.*;
import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        int result = getResult(n, t, c);
        System.out.println(result);
    }

    private static int getResult(int n, int[] t, int[] c) {
        int minTranslator = Integer.MAX_VALUE;
        int minAuthor = Integer.MAX_VALUE;
        int minBoth = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                minTranslator = Math.min(minTranslator, c[i]);
            } else if (t[i] == 2) {
                minAuthor = Math.min(minAuthor, c[i]);
            } else {
                minBoth = Math.min(minBoth, c[i]);
            }
        }

        System.out.println(minTranslator + " Min TRanslator");
        System.out.println(minAuthor + " Min Author");
        System.out.println(minBoth+ " Min Both");
        int result = minTranslator + minAuthor;

        System.out.println(result + " Result");
        if (result < minBoth && result > 0) {
            return result;
        }else
            return minBoth;
    }

    public static String reverseString(String s){
        if (s.length() == 0){
            return "";
        }else
            return reverseString(s.substring(1)) + s.charAt(0);

    }
    public static int reverse(int x){
        int reversed = 0;
        while (x != 0){
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    public  static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n/2; i++){
            if (s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome1(String s){
        int n = s.length();
        if (n <= 1){
            return true;
        }else
            return s.charAt(0) == s.charAt(n - 1) && isPalindrome1(s.substring(1, n - 1));
    }
    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++){
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static int[] generateFibonacciNumbers(int n) {
        int arr[] = new int[n];
        if(n > 0){
            arr[0] =0;
        }
        if(n > 1){
            arr[1] = 1;
        }
        fib(arr, n, 2);
        return arr;
    }
    public static void fib(int arr[], int n, int currentIndex){
        if(currentIndex >= n){
            return;
        }
        arr[currentIndex] = arr[currentIndex-1] + arr[currentIndex -2];
        fib(arr, n, currentIndex + 1);

    }
}

