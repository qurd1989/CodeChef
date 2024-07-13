package begginerLvevelSecondHalf;

import java.util.*;

public class StudingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String word;
        for (int i = 0; i < n; i++){
            word = sc.next();
            boolean flag = true;
            Set<Character> map = new HashSet<>();
            for (char ch : s.toCharArray()) {
               map.add(ch);
            }
                for (char c : word.toCharArray()){
                    if (!map.contains(c)){
                        flag = false;
                        break;
                    }
                }

                if (flag){
                    System.out.println("Yes");
                }else
                    System.out.println("No");

        }
    }
}
