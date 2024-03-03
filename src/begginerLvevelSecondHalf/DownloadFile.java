package begginerLvevelSecondHalf;

import java.util.Scanner;

public class DownloadFile {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int t=kb.nextInt();
        while(t-->0){
            int n=kb.nextInt();
            int k=kb.nextInt();

            int cost=0,totalTime=0;

            while(n-->0){
                int t1=kb.nextInt();
                int d1=kb.nextInt();

                if(k>0){
                    k=k-t1;
                    if(k<0){
                        k=k+t1;
                        cost=(t1-k)*d1;
                        k=0;

                    }
                }
                else if(k==0){
                    cost+=t1*d1;
                }

            }
            System.out.println(cost);
        }
    }
}

