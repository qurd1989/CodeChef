package begginerLvevelSecondHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupAsssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            //N number people party
            int [] p = new int[n];
            for (int i = 0; i < n; i++){
                p[i] = sc.nextInt();
            }
            Map<Integer, Integer> hs = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (!hs.containsKey(p[j])) {
                    hs.put(p[j], 1);
                } else {
                    hs.put(p[j], hs.get(p[j]) + 1);
                }
            }
                int count = 0;
                for (int key : hs.keySet()) {
                    if (hs.get(key) % key ==0) {
                        count++;
                    }else System.out.println("NO");
                    break;
                }
                if (count == hs.size()){
                    System.out.println("YES");
                }
            }
        }
    }

