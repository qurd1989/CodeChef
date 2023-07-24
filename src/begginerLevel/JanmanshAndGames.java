package begginerLevel;

import java.util.Scanner;

public class JanmanshAndGames {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int x=sc.nextInt();//start
            int y=sc.nextInt();//total
            if((x+y)%2==0)
                System.out.println("janmansh");
            else
                System.out.println("jay");
        }
    }
}

