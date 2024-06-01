package begginerLvevelSecondHalf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingInTheHills {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int u = in.nextInt();
            int d = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            boolean para = true;
            int index = 1;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    index++;
                }else if(arr[i]>arr[i-1]){
                    if(arr[i]-arr[i-1]<=u){
                        index++;
                    }else{
                        break;
                    }
                }else if(arr[i]<arr[i-1]){
                    if(arr[i-1]-arr[i]<=d){
                        index++;
                    }else if(para){
                        index++;
                        para = false;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(index);
        }
    }
}