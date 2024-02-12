package begginerLvevelSecondHalf;

import java.util.Scanner;

public class BuyingSweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){

            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            int sumOfNotes = 0;
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
                sumOfNotes += arr[i];
            }
            int a = sumOfNotes/x;
            int count=0;
            for(int j=0;j<n;j++){
                if(sumOfNotes-arr[j]>=(x*a)){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println(-1);
            }
            else{
                System.out.println(a);
            }
        }
    }
}
