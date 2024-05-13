package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UpsAndDowns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int  a[] = new int[n];
            int  b[] = new int[n];
            for (int i = 0; i< n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
           int start = 0;
           int end = n-1;
           int index = 0;
            while (start <= end){
                if (index % 2 == 0){
                    b[index++] = a[index++];
                }else
                    b[index++] = a[end--];
            }
             for (int value : b){
                System.out.print(value + " ");
            }
            System.out.println();
        }
//        int volume = 5;
//        int maleDinkies = 6;
//        int femaleDinkies = 4;
//        int monthsUntilCrowded = monthsUntilCrowded(volume, maleDinkies, femaleDinkies);
//        System.out.println("The tank becomes crowded after " + monthsUntilCrowded + " months.");

    }
    public static int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum ){
        if(tankVolume < 0.5 * (maleNum + femaleNum)){
            return 0;
        }
        int breedingPairs = Math.min(maleNum, femaleNum);
        int months = 0;
        int totalDinkies = maleNum + femaleNum;

        while (true){
            int newDriDinkies = Math.min(breedingPairs, femaleNum );
            totalDinkies += newDriDinkies;
            if (totalDinkies * 0.5 > tankVolume){
                break;
            }
            breedingPairs = totalDinkies /2;
            months++;
        }
        return months;
    }
}
