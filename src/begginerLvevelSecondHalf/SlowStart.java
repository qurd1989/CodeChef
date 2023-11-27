package begginerLvevelSecondHalf;

import java.util.Scanner;

public class SlowStart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int h=sc.nextInt();
            int sum=0;
            int count=0,i=1;

            while(sum<h)
            {
                if(i<=5)
                {
                    sum+=x/2;
                    i++;
                }
                else
                {
                    sum+=x;
                    i++;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
