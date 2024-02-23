package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SimilarDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
           String s[] = new String[4];
           String n[] = new String[4];
            Set<String> hs = new HashSet<>();
           for (int i = 0; i < s.length; i++){
               s[i] = sc.next();
           }
            for (int i = 0; i < s.length; i++){
                n[i] = sc.next();
                hs.add(n[i]);
            }

            int count = 0;
            for (int i = 0; i < s.length; i++){
                if (hs.contains(s[i])){
                    count++;
                }
            }
            if (count >= 2){
                System.out.println("similar");
            }else
                System.out.println("dissimilar");
        }
    }
}
