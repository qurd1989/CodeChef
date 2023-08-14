package begginerLevel;

import java.util.Scanner;

public class BuyTwoGetOneFree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=(x+y)/2;
            int answer=Math.abs(Math.max(x,y) - z);
            System.out.println(answer);
        }
    }
}
