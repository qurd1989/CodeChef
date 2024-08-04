package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            boolean isExist[]  = new boolean[26];
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) != b.charAt(i)){
                    isExist[b.charAt(i) - 'a'] = true;
                }
            }
            int count = 0;
            for (int i = 0; i < 26; i++){
                if (isExist[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
