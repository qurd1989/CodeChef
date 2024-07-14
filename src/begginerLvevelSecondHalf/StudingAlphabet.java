package begginerLvevelSecondHalf;

import java.util.*;

public class StudingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String word;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            word = sc.next();
            if (arraySolution(s, word)) {
                System.out.println("Yes");
            } else
                System.out.println("No");

        }
    }

    private static boolean setSolution(String s, String w) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (char ch : s.toCharArray()) {
                set.add(ch);
            }
            for (char c : w.toCharArray()) {
                if (!set.contains(c)) {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
    private static boolean mapSolution(String s, String w) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray()) {
                map.put(ch, 1);
            }
            for (char c : w.toCharArray()) {
                if (!map.containsKey(c)) {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
    private static boolean arraySolution(String s, String w) {
        boolean knownLetters [] = new boolean[26];
        for (char ch : s.toCharArray()){
            knownLetters[ch - 'a'] = true;
        }
        boolean flag = true;
        for (char ch : w.toCharArray()){
            if (!knownLetters[ch -'a']){
                flag = false;
                return flag;
            }
        }
        return true;
    }
}

