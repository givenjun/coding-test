import java.io.*;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");
        long[] A = new long[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(S[i]);
        }
        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            long find = A[i];
            int start = 0;
            int chk = N - 1;

            while (start != chk) {
                long sum = A[start] + A[chk];
                if (find == sum) {
                    if (start != i && chk != i) {
                        cnt++;
                        break;
                    }
                    else if (start == i) {
                        start++;
                    }
                    else if (chk == i) {
                        chk--;
                    }
                }
                else 
                
                if (find < sum) chk--;
                else start++;
                
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
