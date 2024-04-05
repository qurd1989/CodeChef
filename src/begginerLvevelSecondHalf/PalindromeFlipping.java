package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            String s = sc.next();
            int zerosCounts = 0;
            int onesCounts = 0;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '1'){
                    onesCounts++;
                }else
                    zerosCounts++;
            }
            if (s.length()%2 == 0) {
                System.out.println("Yes");
            } else {
                if (onesCounts % 2 == 0 && zerosCounts % 2 == 0) {
                    System.out.println("Yes");
                } else
                    System.out.println("No");
            }
        }
    }

    public static String isReversed(String s){
        int n = s.length();
        int start = 0;
        int end = n-1;
        char c[] = s.toCharArray();
        while (start < end){
            char temp = c[start];
            c[start]  = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        return new String(c);
    }

    public static String reverseString(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        return new String(sb);
    }

    public static String reverseStringStack(String s){
        int n =s.length();
        char c[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i =0; i < n; i++){
            stack.push(c[i]);
        }
        for (int i = 0; i < n; i++){
            c[i] = stack.peek();
            stack.pop();
        }

        return new String(c);
    }

}
