package begginerLevel;

import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++){
            int a = read.nextInt();
            int b = read.nextInt();
            int count = 0;
            while(a!=0 || b!=0){
                if(a%3==0 || b%3==0){
                    System.out.println(count);
                    break;
                }
                a = a - b;
                count = count + 1;
            }
        }
    }
}
