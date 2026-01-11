package silver;

import java.io.*;

public class ex2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int start = 1;
        int end = 1;
        long cnt = 1;
        long sum = 1;
        
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        while (end != N) {
            if (sum == N) {
                cnt++;
                end++;
                sum += end;
            }
            else if (sum > N) {
                sum -= start;
                start++;
            }
            else if (sum < N) {
                end++;
                sum += end;
            }
        }
        
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
