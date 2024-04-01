package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ImmortalFrieza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String R = "";
            int countFreiza = 0, countOther = 0;
            for (char c : s.toCharArray()) {
                if (isFrieza(c)) {
                    countFreiza++;
                    if (countOther > 0) {
                        R += countOther;
                        countOther = 0;
                    }
                } else {
                    countOther++;
                    if (countFreiza > 0) {
                        R += countFreiza;
                        countFreiza = 0;
                    }
                }
            }
            if (countFreiza > countOther) {
                R += countFreiza;
            } else
                R += countOther;

            System.out.println(R);
        }
    }

    public static boolean isFrieza(char c) {
        Set<Character> friezeChars = new HashSet<>();
        friezeChars.add('f');
        friezeChars.add('r');
        friezeChars.add('i');
        friezeChars.add('e');
        friezeChars.add('z');
        friezeChars.add('a');
        return friezeChars.contains(c);
    }
}
