package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PieceOfCake1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int charCount[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                charCount[currentChar - 'a']++;

            }
            int maxFreq = Integer.MIN_VALUE;
            for (int count : charCount) {
                if (count > maxFreq) {
                    maxFreq = count;
                }
            }
            if (s.length()- maxFreq == maxFreq){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
