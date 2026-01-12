package silver;

import java.io.*;

public class Ex11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");
        int[] A = new int[N];
        int[] sum = new int[N];
        int total = 0;
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(S[i]);
        }
        
        for (int i = 1; i < N; i++) {
            int tmp = A[i];
            int idx = i;
            for (int j = 0; j < i; j++) {
                if (tmp < A[j]) {
                    idx = j;
                    break;
                }
            }
            for (int j = i; j > idx; j--) {
                A[j] = A[j - 1];
            }
            A[idx] = tmp;
        }
        
        for (int i = 0; i < N; i++) {
            if (i == 0) sum[i] = A[i];
            else sum[i] = sum[i-1] + A[i];
            total += sum[i];
        }

        bw.write(total + "");
        bw.flush();
        bw.close();

    }
}
