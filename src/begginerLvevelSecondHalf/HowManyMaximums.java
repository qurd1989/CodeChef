package begginerLvevelSecondHalf;

import java.util.Scanner;

public class HowManyMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int last=0;
            int count=1;
            int curr;
            for(int i=0;i<n-1;i++)
            {
                curr=s.charAt(i) - '0';
                if(curr < last)
                {
                    count++;
                }
                last=curr;
            }
            System.out.println(count);

        }
    }
}
