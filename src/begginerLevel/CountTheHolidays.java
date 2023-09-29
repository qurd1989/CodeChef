package begginerLevel;

import java.util.HashSet;
import java.util.Scanner;

public class CountTheHolidays {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++) {
            int n = read.nextInt();
            HashSet<Integer> set = new HashSet<>();
            set.add(6);
            set.add(7);
            set.add(13);
            set.add(14);
            set.add(20);
            set.add(21);
            set.add(27);
            set.add(28);

            int count = 0;
            for (int k = 0; k < n; k++) {
                int day = read.nextInt();
                if (!set.contains(day)) {
                    count++;
                }
            }
            System.out.println(count + 8);
        }
    }
}
