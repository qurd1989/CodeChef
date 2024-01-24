package begginerLvevelSecondHalf;

import java.util.*;

public class DiscrepanciesInTheVotersList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> hs = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n1 = sc.nextInt() + sc.nextInt() + sc.nextInt();
        for (int i = 0; i < n1; i++){
            int key = sc.nextInt();
            if (hs.containsKey(key)){
                hs.put(key, hs.getOrDefault(key, 0)+1);
            }else
                hs.put(key, 1);
        }
        for (int key : hs.keySet()){
            if (hs.get(key) > 1){
                list.add(key);
            }
        }
        Collections.sort(list);
        int n = list.size();
        System.out.println(n);
        for (Integer keys : list){
            System.out.println(keys);
        }

    }
}
