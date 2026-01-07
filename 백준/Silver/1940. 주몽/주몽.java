import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");
        int[] A = new int[N];
        int start = 0;
        int end = N-1;
        int sum = 0;
        int cnt = 0;
        int n = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(S[i]);
        }
        Arrays.sort(A);
        // for (int a : A) {
        //     bw.write(a + " ");
        // }
        // bw.newLine();

        while (start < end) {
            sum = A[start] + A[end];
            // bw.write(n + " " + "A[" + start + "] + A[" + end + "] = " + sum + "\n");
            if (sum == M) {
                cnt++;
                start++;
                end--;
            }
            else if (sum > M) {
                end--;
            }
            else if (sum < M) {
                start++;
            }
            n++;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
