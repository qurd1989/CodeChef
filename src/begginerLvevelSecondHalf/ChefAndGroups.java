package begginerLvevelSecondHalf;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ChefAndGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            String s = sc.next();
            int n = s.length();
            int count = 0;
            int i = 0;
            while (i< n) {
                if (s.charAt(i) == '0'){
                    i++;
                }else {
                    count++;
                    i++;
                    while (i < n && s.charAt(i) == '1') {
                        i++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
