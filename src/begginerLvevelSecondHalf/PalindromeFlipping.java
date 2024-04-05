package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            System.out.println(reverseStringStack(s));
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
