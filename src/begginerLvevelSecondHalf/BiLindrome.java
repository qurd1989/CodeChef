package begginerLvevelSecondHalf;

import java.util.*;
public class BiLindrome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n  =sc.nextInt();
            String s = sc.next();
            if(biLindrome(s, n)){
                System.out.println(n-2);
            }else
                System.out.println(-1);
        }
    }

    static int solve(String hatStack, String needle) {
        int n = hatStack.length();
        int m = needle.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (hatStack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j == m) {
                    return i - m + 1;  // Correct index calculation
                }
            } else {
                i--;  // Reset i to the mismatch position
                j = 0;
            }
        }
        return -1;
    }
    public  static boolean biLindrome(String s, int n) {
        int charCount[] = new int[26];
        for (int i = 0; i< n; i++){
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++){
            if (charCount[i] > 1){
                return true;
            }
        }
        return false;
    }

}
