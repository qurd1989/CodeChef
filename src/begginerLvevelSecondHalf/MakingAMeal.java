package begginerLvevelSecondHalf;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class MakingAMeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int letterCounts[] = new int[6];
            for (int i = 0; i < n; i++){
                String s =sc.next();
                for (char c : s.toCharArray()){
                    switch (c){
                        case 'c': letterCounts[0]++;
                            break;
                        case 'o': letterCounts[1]++;
                            break;
                        case 'e': letterCounts[2]++;
                            break;
                        case 'd': letterCounts[3]++;
                            break;
                        case 'h': letterCounts[4]++;
                            break;
                        case 'f': letterCounts[5]++;
                            break;
                    }
                }
            }
            int c = letterCounts[0]/2 ;
            int o = letterCounts[0];
            int e = letterCounts[2]/2;
            int d= letterCounts[3];
            int h = letterCounts[4];
            int f = letterCounts[5];

            int maxMeals = Math.min(Math.min(c,e), Math.min(Math.min(o,d), Math.min(h,f)));
            System.out.println(maxMeals);
  /*          int c = 0, e = 0, d = 0, o = 0, h = 0, f = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int r = s.length();
                for (int j = 0; j < r; j++) {
                    if (s.charAt(j) == 'c'){
                        c++;
                    } else if (s.charAt(j) == 'e') {
                        e++;
                    }else if (s.charAt(j) == 'd'){
                        d++;
                    }else if (s.charAt(j) == 'o'){
                        o++;
                    }else if (s.charAt(j) == 'h'){
                        h++;
                    }else if (s.charAt(j) == 'f'){
                        f++;
                    }
                }
                }
            int arr[]={c/2,o,d,e/2,h,f};

            Arrays.sort(arr);
            System.out.println(arr[0]);
            }
            */
        }
        }
    }

