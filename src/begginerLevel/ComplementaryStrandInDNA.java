package begginerLevel;

import java.util.Scanner;

public class ComplementaryStrandInDNA {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            sc.nextLine();

            String s = sc.nextLine();
            
            char dna[] = s.toCharArray();
            

            for (int i = 0; i < n; i++) {

                if (dna[i] == 'A') {
                    
                    dna[i] = 'T';
                    
                }else if (dna[i] == 'T'){
                    
                    dna[i] = 'A';
                    
                } else if (dna[i] == 'C') {
                    dna[i]= 'G';

                } else if (dna[i] == 'G') {
                    dna[i] = 'C';

                }

            }
            System.out.println(dna);
        }
    }


}
