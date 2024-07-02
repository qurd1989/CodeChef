package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndHisApartmentDues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int totalDue = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++){
                if (arr[i] == 0) {
                    totalDue += 1000 + 100;
                    flag = true;
                }else if (flag){
                    totalDue += 1000;
                }
            }

            System.out.println(totalDue);
        }
    }
}
