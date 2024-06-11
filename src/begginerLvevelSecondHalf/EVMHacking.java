package begginerLvevelSecondHalf;

import java.util.Scanner;

public class EVMHacking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0 ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            Boolean winnable = false;
            int totalVotes = p + r + q;
            if ((b + p + c) > (totalVotes /2)){
                winnable =true;
            }else if ((c + a + q) > (totalVotes /2)){
                winnable =true;
            } else if ((a + b +r) > (totalVotes/2)) {
                winnable=true;
            }

            if (winnable){
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}
