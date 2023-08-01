package begginerLevel;

import java.util.Scanner;

public class BinaryBattles {

    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int count=0;
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=a;
            for(int j=0;j<d;j++){
                if(Math.pow(2,j)==a){
                    count=j;
                    break;
                }
            }
            System.out.println(count*b+(count-1)*c);
        }
        // your code goes here
    }
}

