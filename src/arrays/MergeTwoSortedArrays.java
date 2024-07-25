package arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        int i = 0, j = 0, k = 0;
        int result[] = new int[n + m];
        while (i < n || j < m){
            if (arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
                i++;
            }else {
                result[k++] = arr2[j];
                j++;
            }
        }
        while (i < n) {
            result[k++] = arr1[i++];
        }
        while (j < m) {
            result[k++] = arr2[j++];
        }
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    public double probabilityOfHeads(double[] coinProbabilities, int target) {

        // Initialize an array to store the probabilities of getting exactly 'i' heads after tossing 'j' coins.
        // f[i] represents the probability of getting exactly 'i' heads.
        double[] probabilities = new double[target + 1];

        // Base case: the probability of getting 0 heads (all tails) is initially 1.
        probabilities[0] = 1;

        // Iterate over each coin probability.
        for (double coinProbability : coinProbabilities) {

            // Iterate backwards over the possible numbers of heads.
            // This is to prevent that the updating of f[j] affects the updating of f[j+1].
            for (int j = target; j >= 0; --j) {

                // Each time a coin is tossed, the probability of getting 'j' heads is updated:
                // 1. The probability of getting 'j' heads without the current coin (probability of tails
                //    of the current coin is multiplied by the previous 'j' heads probability).
                probabilities[j] *= (1 - coinProbability);

                // 2. If j is more than 0, update the probability by adding:
                //    the probability of getting 'j - 1' heads after the previous tosses and getting heads
                //    this time (current coin's probability of heads is multiplied by the previous 'j-1' heads probability).
                if (j > 0) {
                    probabilities[j] += coinProbability * probabilities[j - 1];
                }
            }
        }

        // The final result is the probability of getting exactly 'target' heads after tossing all coins.
        return probabilities[target];
    }
}
