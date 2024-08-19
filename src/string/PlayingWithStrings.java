package string;
import java.util.Scanner;
public class PlayingWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();

            String s = sc.next();
            String r =sc.next();
            int sCounts = 0;
            int rCounts = 0;
            for (int i=0; i<n; i++){
                if (s.charAt(i) == '1'){
                    sCounts++;
                }
                if (r.charAt(i) =='1'){
                    rCounts++;
                }
            }
            if (sCounts == rCounts){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
