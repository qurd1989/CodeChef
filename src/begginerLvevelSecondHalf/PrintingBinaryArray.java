package begginerLvevelSecondHalf;

import java.util.Scanner;

public class PrintingBinaryArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++){
                int data = sc.nextInt();
                if (data == 0){
                    System.out.print(1+ " ");
                }else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
