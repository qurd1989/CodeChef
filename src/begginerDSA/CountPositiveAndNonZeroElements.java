package begginerDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPositiveAndNonZeroElements {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        int  ele;
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++){
                ele = sc.nextInt();
                list.add(ele);

            }
            int pos = 0;
            int neg = 0;
            int divK = 0;
            int s = 0;
            while (list.size()> s){
                if (list.get(s) > 0){
                    pos++;
                }
                else if (list.get(s) < 0){
                    neg++;
                } else if (list.get(s) % k ==0) {
                    divK++;
                }
                s++;
            }

            System.out.println(pos+ " " + neg + " " + divK);
        }

    }
}
