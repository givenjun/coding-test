package algorithm;

import java.io.*;

public class CountingSort {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] res = new int[n];
        int[] cnt = new int[10001];
        int[] cntSum = new int[10001];

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            cnt[a[i]]++; 
        }

        cntSum[0] = cnt[0];
        for (int i = 1; i <= 10000; i++) {
            cntSum[i] = cntSum[i - 1] + cnt[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            res[cntSum[a[i]] - 1] = a[i];
            cntSum[a[i] - 1]--;
        }

        for (int r : res) {
            bw.write(r + " ");
        }

        bw.flush();
        bw.close();

    }
}
