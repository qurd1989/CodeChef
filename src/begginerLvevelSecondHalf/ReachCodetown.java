package begginerLvevelSecondHalf;

import begginerLevel.TestingRobot;

import java.util.Scanner;

public class ReachCodetown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            char c[] = s.toCharArray();
            boolean isVowel[] = {false, true, false, true, false, true,false,false};
            boolean isValid = true;

            for(int i=0;i<8;i++) {
                if ("AEIOU".contains(c[i] + "") != isVowel[i]) {
                    isValid = false;
                    break;
                }
            }
            System.out.println((isValid ? "YES" : "NO"));
        }
    }
}
