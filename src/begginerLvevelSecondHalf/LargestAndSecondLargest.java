package begginerLvevelSecondHalf;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int largest = 0;
            int secondLargest =0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                if (arr[i] > largest){
                    secondLargest = largest;
                    largest = arr[i];
                }else if(secondLargest < arr[i] && arr[i] < largest){
                    secondLargest = arr[i];
                }
            }
            System.out.println(largest+secondLargest);
        }

    }
}
