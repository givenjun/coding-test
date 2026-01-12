package silver;

import java.io.*;

public class ex1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] S = br.readLine().split("");
        int L = S.length;
        
        int[] A = new int[L];
        for (int i = 0; i < L; i++) {
            A[i] = Integer.parseInt(S[i]);
        }

        for (int i = 0; i < L; i++) {
            int idx = 0;
            int max = 0;
            for (int j = i; j < L; j++) {
                if (max <= A[j]) {
                    max = A[j];
                    idx = j;
                }
            }
            swap(A, i, idx);
        }
        
        for (int a : A) {
            bw.write(a + "");
        }
        bw.flush();
        bw.close();
    }
    public static void swap(int[] a, int b, int c) {
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }
}
