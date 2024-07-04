package begginerLvevelSecondHalf;

import java.util.Scanner;

public class Subanagrams {
    public static void main(String[] args) {
        int res[] = new int[26];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String s = sc.next();
            for (char ch : s.toCharArray()){
                res[ch - 'a']++;
            }
        }
    }
}

