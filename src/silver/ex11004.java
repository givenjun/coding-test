package silver;

import java.io.*;
import java.util.Arrays;

public class ex11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        String[] S = br.readLine().split(" ");
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(S[i]);
        }

        Arrays.sort(A);

        bw.write(A[K - 1] + "");
        bw.flush();
        bw.close();
    }
}
