package begginerLevel;

import java.util.Scanner;

public class DegreeOfPolynomial {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int a[]= new int[n];
            int max=0;
            for (int i=0;i<n ;i++ ){
                a[i]=s.nextInt();
                if(a[i]!=0){

                    max=i;
                }
            }
            System.out.println(max);
        }
    }
}