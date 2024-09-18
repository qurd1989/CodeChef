package begginerLvevelSecondHalf;
import java.util.Scanner;
public class EvenSumSubArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int result = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                result += arr[i];
            }
            if (result % 2 == 0){
                System.out.println(0);
            } else {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0) {
                        count++;
                    }
                }
                if (count >= 2) {
                    System.out.println(2);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }

}
