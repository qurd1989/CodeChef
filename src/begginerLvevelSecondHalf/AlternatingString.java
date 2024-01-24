package begginerLvevelSecondHalf;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class AlternatingString {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {

            int n = sc.nextInt();
            String s = sc.next();
            int zeroCounts = 0;
            int oneCounts = 0;
            for (int i = 0; i < n; i++){
                if (s.charAt(i) == '1') {
                    oneCounts++;
                }else
                    zeroCounts++;
            }
            if (zeroCounts == oneCounts){
                System.out.println(zeroCounts + oneCounts);
            }else if (zeroCounts < oneCounts){
                System.out.println(zeroCounts *2 + 1);
            }else
                System.out.println(oneCounts * 2 + 1);
        }
    }
}
