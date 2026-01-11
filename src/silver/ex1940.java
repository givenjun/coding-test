package silver;

import java.io.*;
import java.util.Arrays;

public class ex1940 {
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

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(S[i]);
        }
        Arrays.sort(A);

        while (start < end) {
            sum = A[start] + A[end];
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
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
