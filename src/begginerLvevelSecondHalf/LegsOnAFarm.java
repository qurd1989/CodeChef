package begginerLvevelSecondHalf;

import java.util.Scanner;

public class LegsOnAFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--> 0){
            int n =sc.nextInt();
            int minAnimals;
            if (n % 4 == 0) {
                minAnimals = n / 4;
            } else {
                minAnimals = (n - 2) / 4 + 1;
            }
            System.out.println(minAnimals);
        }
    }
}