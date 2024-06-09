package begginerLvevelSecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int  friends[] = new int[n];

            for (int i = 0; i < n; i++){
                friends[i] = sc.nextInt();
            }
            int eligibleFriends = 0;
            Arrays.sort(friends);
            for (int i = 0; i < n; i++){
                if (friends[i] <= eligibleFriends){
                    eligibleFriends++;
                }else
                    if (friends[i] > eligibleFriends){
                        break;
                    }
            }
            System.out.println(eligibleFriends);
        }
    }
}
