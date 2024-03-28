package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.Scanner;

public class HostelRoom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;

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
