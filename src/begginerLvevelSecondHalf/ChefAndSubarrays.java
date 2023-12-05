package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int count = 0;
            int n = sc.nextInt();
            int subArray[] = new int[n];
            for (int i = 0; i < n; i++) {
                subArray[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++){
                int sum = 0;
                int product = 1;
                for (int j = i; j < n; j++){
                    sum += subArray[j];
                    product *= subArray[j];
                    if (sum == product){
                        count++;
                    }
                }

            }
            System.out.println(count);
        }
    }
}
