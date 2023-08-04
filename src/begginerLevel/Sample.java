package begginerLevel;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int aliceScore = solve(sc);
            int bobScore = solve(sc);

            if (aliceScore > bobScore) {
                System.out.println("Alice");
            } else if (aliceScore < bobScore) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }
    public static int solve(Scanner sc){

        int arr[] = new int[3];
        for(int i = 0; i <3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + arr[1]);
        return arr[1] + arr[2];
    }
}

