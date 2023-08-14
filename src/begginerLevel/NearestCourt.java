package begginerLevel;

import java.util.Scanner;

public class NearestCourt {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y= sc.nextInt();
            int z=(x+y)/2;

            System.out.println(Math.max(Math.abs(x-z),Math.abs(y-z)));
        }
    }
}