package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases



        while (t-- > 0) {
            int n = sc.nextInt(); // number of animals
            int maxType = 0;

            // Keep track of animal types and their counts
            HashMap<Integer, Integer> counts = new HashMap<>();

            // Read in types and update max type
            for (int i = 0; i < n; i++) {
                int type = sc.nextInt();
                maxType = Math.max(maxType, type);
                counts.putIfAbsent(type, 0);
                counts.put(type, counts.get(type) + 1);
            }

            // Allocate smaller array based on highest encountered type
            int[] evenCounts = new int[maxType + 1];

            // Check for any odd count
            boolean possible = true;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                int type = entry.getKey();
                int count = entry.getValue();
                evenCounts[type] = count % 2;
                if (evenCounts[type] == 1) {
                    possible = false;
                    break;
                }
            }

            // Print result
            System.out.println(possible ? "YES" : "NO");
        }
    }
}