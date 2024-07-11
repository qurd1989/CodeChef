package begginerLvevelSecondHalf;

import java.util.Map;
import java.util.Scanner;

public class OnlyPluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (isSubstring(s1, s2)){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
    private static boolean isSubstring(String str1, String str2){
        if (str2.length() > str1.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            boolean isMatch = true;
            for (int j = 0; j < str2.length(); j++){
                if (str1.charAt(i + j) != str2.charAt(j)){
                    isMatch = false;
                    break;
                }
            }
            if (isMatch){
                return true;
            }
        }
        return false;
    }
}
