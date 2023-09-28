package begginerLevel;

import java.util.Scanner;

public class AvoidConatc {

    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=read.nextInt();
            int y=read.nextInt();
            if(y==0)
                System.out.println(x);
            else if(x==y)
                System.out.println(2*x-1);
            else
            {
                System.out.println((x-y)+(y*2));
            }
        }
    }
}

