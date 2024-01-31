package begginerLevel;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestingRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            Set<Integer> hasset = new HashSet<>();
            hasset.add(x);
            for (int i = 0; i < n; i++){
                if (s.charAt(i)== 'L'){
                    x -= 1;
                    hasset.add(x);
                }else if (s.charAt(i) == 'R')
                    x +=1;
                hasset.add(x);
            }
            System.out.println(hasset.size());
        }
    }
}
