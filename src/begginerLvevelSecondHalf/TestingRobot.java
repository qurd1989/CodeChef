package begginerLvevelSecondHalf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestingRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            Set<Integer> set = new HashSet<>();
            set.add(x);
            for (int i = 0; i < n; i++){
                if (s.charAt(i) == 'L'){
                    x--;
                }
                else{
                    x++;
                }
                    set.add(x);
            }
            System.out.println(set.size());
        }
    }
}
