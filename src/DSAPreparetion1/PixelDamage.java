package DSAPreparetion1;

import java.util.Scanner;

public class PixelDamage {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while(t-- > 0){

            long h = read.nextLong();
            long w = read.nextLong();
            long x = read.nextLong();
            long y = read.nextLong();
            double k = read.nextLong();

            double ans = Math.pow((w-x),2) + Math.pow((h-y),2);

            double ans1 = Math.pow(ans,0.5);

            if(ans1 < k){
                System.out.println(1);
            }else{
                System.out.println(0);
            }


        }
    }

    }

