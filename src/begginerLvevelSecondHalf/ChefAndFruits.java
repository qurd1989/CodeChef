package begginerLvevelSecondHalf;
import java.util.Scanner;
public class ChefAndFruits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
          int n = sc.nextInt();
          int m = sc.nextInt();
          int k = sc.nextInt();
            int diff = Math.abs(n-m);
            if(diff > k){
                System.out.println(diff-k);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
