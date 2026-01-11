import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        
        String[] str = br.readLine().split(" ");
        int[] sum = new int[N];
        
        sum[0] = Integer.parseInt(str[0]);
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(str[i]); 
        }
        for (int i = 0; i < M; i++) {
            String[] IJ = br.readLine().split(" ");
            int I = (Integer.parseInt(IJ[0])) - 2;
            int J = (Integer.parseInt(IJ[1])) - 1;
            int res = 0;
            if (I < 0) res = sum[J];
            else res = sum[J] - sum[I];
     
            bw.write(res + "\n");
        }
        bw.flush();
        bw.close();
    }
}