package begginerLvevelSecondHalf;

import java.util.Scanner;

public class NonAdjacentflips {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(numOFflips(n,s));
        }
    }
    public static int numOFflips(int n, String s){
        int count = 0;
        if (s.charAt(0)== '1'){
            count++;
        }
        for (int i =1; i< n; i++){
                if (s.charAt(i) == '1' && s.charAt(i-1) == '1') {
                    return 2;
                }
                if (s.charAt(i)=='1'){
                    count++;
                }
                if (count == 0){
                    return 0;
                }
        }
        return 1;
    }
}
