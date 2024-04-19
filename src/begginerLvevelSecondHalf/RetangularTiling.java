package begginerLvevelSecondHalf;

import java.util.Scanner;

public class RetangularTiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int w = sc.nextInt();
            int l = sc.nextInt();
            if (w % 2 !=0 && l % 2 !=0){
                System.out.println("Yes");
            }else
                System.out.println("No");


            String text = sc.next();
            String pattern = sc.next();
            System.out.println(hasSubstring(text, pattern));
        }
    }

    public static boolean hasSubstring(String text, String pattern){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < text.length() && j < pattern.length()){
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }else {
                j = 0;
                k++;
                i = k;
            }
            if (j == pattern.length()){
                return true;
            }
        }
        return false;
    }

}
