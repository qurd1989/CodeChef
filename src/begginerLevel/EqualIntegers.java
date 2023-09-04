package begginerLevel;

import java.util.Scanner;

public class EqualIntegers {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0; i<t; i++){
            int x = read.nextInt();
            int y = read.nextInt();
            int count = 0;
            if(x==y){
                System.out.println(0);
            }
            if(x<y){
                System.out.println((y-x)/1);
            }
            else if(x>y){
                if((x-y)%2==1){
                    System.out.println(2+((x-y)/2));
                }
                else{
                    System.out.println((x-y)/2);
                }
            }
        }
    }
}