package begginerLevel;

import java.util.Scanner;

public class PackingBooks {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int x=sc.nextInt();//total shelves
            int y=sc.nextInt();//each shelves contains
            int z=sc.nextInt();//atmost
            if(y%z==0)
                System.out.println((x*y)/z);
            else
                System.out.println(((y/z)+1)*x);
        }
    }
}

