import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] str = br.readLine().split(" ");
        long[] sum = new long[N];
        long[] arr = new long[M];
        long cnt = 0;

        
        for (int i = 0; i < N; i++) {
            if (i == 0) sum[i] = Integer.parseInt(str[i]);
            else sum[i] = sum[i-1] + Integer.parseInt(str[i]);

            int remainder = (int) (sum[i] % M);
            arr[remainder]++;
            if (remainder == 0) cnt++;
        }
        for (int i = 0; i < M; i++) {
            if (arr[i] > 1)
                cnt += arr[i] * (arr[i] - 1) / 2;
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}

