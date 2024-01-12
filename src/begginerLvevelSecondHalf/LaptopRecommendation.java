package begginerLvevelSecondHalf;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LaptopRecommendation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();

            int friends[] = new int[n];
            for (int i = 0; i < n; i++){
                friends[i] = sc.nextInt();
            }

            Map<Integer, Integer> hs = new HashMap<>();
            for (int i = 0; i< n; i++) {
                hs.put(friends[i], hs.getOrDefault(friends[i], 0) +1);

            }
            int maxRecammendations = 0;
            int index = -1;
            for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
                if (entry.getValue() > maxRecammendations) {
                    maxRecammendations = entry.getValue();
                    index = entry.getKey();
                }
            }
            int maxcounbt =0;
            for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
                if (entry.getValue() == maxRecammendations) {
                    maxcounbt++;
                }

            }
            if (maxcounbt != 1){
                System.out.println("CONFUSED");
            }else
                System.out.println(index);
        }
    }
}
