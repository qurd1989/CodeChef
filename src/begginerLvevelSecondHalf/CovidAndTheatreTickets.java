package begginerLvevelSecondHalf;

import java.util.Scanner;

public class CovidAndTheatreTickets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int rowMax = 0;
            int SeatsMAx = 0;
            if(n % 2 ==0){
                rowMax = (n/2);
            }else {
               rowMax = (n+1) /2;;
            }
            if (m % 2 == 0){
                SeatsMAx = (m / 2);
            }else {
                SeatsMAx = (m + 1) / 2;
            }
            System.out.println(rowMax * SeatsMAx);
        }

    }
}
