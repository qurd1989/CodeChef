package begginerLevel;

import java.util.Scanner;

public class CheflandGames {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int A[] = new int[4] ;

            int count0 = 0;

            for(int i=0; i<4; i++){
                A[i] = sc.nextInt();
                if(A[i] == 0)
                    count0++ ;
            }

            if(count0 == 4)
                System.out.println("IN") ;
            else
                System.out.println("OUT");
        }
    }
}

