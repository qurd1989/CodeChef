package contest;
import java.util.Arrays;
import java.util.Scanner;
public class RangeMinimze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            int A[] = new int[n];

            // Read the array
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            System.out.println("A: "+Arrays.toString(A));

            Arrays.sort(A);
            System.out.println("A: "+Arrays.toString(A));

            if (n <= 3) {
                System.out.println(0);
                System.out.println("A: "+Arrays.toString(A));
                continue;
            }

            int option1 = A[n-1] - A[2];
            // Remove the largest two elements (keep elements from A[0] to A[N-3])
            int option2 = A[n-3] - A[0];
            System.out.println("option2: "+option2);
            // Remove the smallest one and the largest one (keep elements from A[1] to A[N-2])
            int option3 = A[n-2] - A[1];
            System.out.println("option1: "+option1);

            // Find the minimum of the three options
            int result = Math.min(option1, Math.min(option2, option3));

            // Output the result
            System.out.println(result);
        }
    }
}