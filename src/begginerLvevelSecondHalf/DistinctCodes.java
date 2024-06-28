package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < s.length()-1; i++){
                String subString = s.substring(i, i+2);
                set.add(subString);
            }
            System.out.println(set.size());
        }
    }
}
