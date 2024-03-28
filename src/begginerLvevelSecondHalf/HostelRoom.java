package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Scanner;

public class HostelRoom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int events[] = new int[n];
            for (int i = 0; i < n; i++){
                events[i] = sc.nextInt();
            }
            int max_peopleInRoom = x;
            int sum = x;
            for (int i = 0; i < n; i++){
                sum = events[i] + sum;
                if (sum >= max_peopleInRoom){
                    max_peopleInRoom = sum;
                }else if (sum < 0){
                    sum = x;
                }
            }
            System.out.println(max_peopleInRoom);
        }
    }

    public static void adjcentEdge(Scanner sc, int n){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n-1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            }
          for (int i = 0; i < n; i++){
              System.out.print("Node " + i + ": ");
              for (int neighbor : adj.get(i)){
                  System.out.print(neighbor + " ");
              }
              System.out.println();
        }
    }
}
