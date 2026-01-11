import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = N - 1; j > 0; j--) {
                int first = A[j - 1];
                int second = A[j];
                if (first > second) {
                    int tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                    cnt++;
                }
            }
            if (cnt == 0) break;
        }
        for (int a : A) bw.write(a + "\n");
        bw.flush();
        bw.close();
    }
}
