package begginerLevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class AllUniqueCharacters {

    public static void main(String[] args) {

        String s = "Elmar";

//        System.out.println(solve(s));
       System.out.println(solveWithHashset(s));
    }

    private static boolean solveWithHashset(String s) {

        HashSet<String> hashSet = new HashSet<>();

        for (int i =0; i < s.length(); i++) {

            hashSet.add(s);


        }
        return s.length() != hashSet.size();
    }

    /*private static boolean solve(String s) {

        char str[] = s.toCharArray();

        Arrays.sort(str);
        for (int i = 0; i < s.length() - 1; i++) {
            if (str[i] != str[i + 1]) {
                continue;
            } else
                return false;

        }
        return true;
    }*/


}
