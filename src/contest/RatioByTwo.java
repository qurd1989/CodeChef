package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class RatioByTwo {
    static CustomPrintStream out;
    static void solve(FastReader cin,CustomPrintStream ps){
        int t=cin.nextInt();

        while (t-->0) {
            int x=cin.nextInt();
            int y=cin.nextInt();

            int operations=0;
            if(x>=2*y || y>=2*x){
            }
            else{
                if(x == y){
                    operations+= x - (x/2);
                }
                else{
                    int ld= x-(y/2);
                    int rd = y- (x/2);
                    operations = Math.min(ld,rd);
                }
            }
            cout(operations);
        }
    }
    public static void main(String[] args) throws IOException {
        out = new CustomPrintStream(System.out);
        FastReader in = new FastReader();
        solve(in, out);
    }
    static void cout(Object x){System.out.println(x);}
    static class FastReader {
        BufferedReader br; StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
    static class CustomPrintStream extends PrintStream {
        public CustomPrintStream(OutputStream out) { super(out); }
        void yes(){this.println("YES");}
        void no(){this.println("NO");}
    }
}
