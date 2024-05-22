package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++){
                set.add(s.charAt(i));
            }
            if (set.size() >2 ){
                System.out.println("NO");
            }else if (set.size() == 1){
                System.out.println("YES");
            }else  {
                if (s.length() % 2 != 0) {
                    System.out.println("NO");
                } else {

                    boolean isAlternating = true;
                    for (int i = 0; i < s.length(); i++){
                        if (i % 2 ==0 && s.charAt(i) != s.charAt(0)){
                            isAlternating = false;
                            break;
                        }else if (i % 2 == 1 && s.charAt(i) != s.charAt(1)){
                            isAlternating = false;
                            break;
                        }
                    }
                    if (isAlternating){
                        System.out.println("YES");
                    }else
                        System.out.println("NO");
                }
            }
        }
    }
}
