package arrays;

import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

