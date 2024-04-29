package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChefAndWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int max = 0;
            int boxes[] = new int[n];
            for (int i = 0; i  <n; i++){
                boxes[i] = sc.nextInt();
                if (boxes[i] > max){
                    max = boxes[i];
                }
            }

            int count = 0;
            int temp = 0;
            if (max > k) {
                System.out.println(-1);
            }else {
                for (int i = 0; i < n; i++) {
                    if ((temp + boxes[i]) <= k) {
                        count++;
                        temp += boxes [i];
                    }
                }
            }
            System.out.println(count);
        }
    }
}
