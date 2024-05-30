package begginerLvevelSecondHalf;

import java.util.Scanner;

public class ChristmasCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int seatedFriends[] = new int[n];
            for (int i = 0; i < n; i++){
                seatedFriends[i] = sc.nextInt();
            }
            int count = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (seatedFriends[i] > max) {
                    max = seatedFriends[i];
                } else {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
