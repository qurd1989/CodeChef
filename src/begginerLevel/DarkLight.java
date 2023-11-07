package begginerLevel;

import java.util.Scanner;

public class DarkLight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k==1){
                if(n%4==0)
                    System.out.println("On");

                else
                    System.out.println("Ambiguous");
            }
            else{
                if(n%4==0)
                    System.out.println("Off");

                else
                    System.out.println("On");
            }

        }
    }
}