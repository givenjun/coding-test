import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] N_M = br.readLine().split(" ");
        int N = Integer.parseInt(N_M[0]);
        int M = Integer.parseInt(N_M[1]);
        
        String[][] rows = new String[N][N];
        int[][] sum = new int[N][N];

        
        for (int i = 0; i < N; i++) {
            rows[i] = br.readLine().split(" ");   
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 && j == 0) sum[0][0] = Integer.parseInt(rows[0][0]);
                else if (i == 0 && j > 0) {
                    sum[0][j] = sum[0][j-1] + Integer.parseInt(rows[0][j]);
                }
                else if (j == 0 && i > 0) {
                    sum[i][0] = sum[i-1][0] + Integer.parseInt(rows[i][0]);
                }
                else {
                    sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + Integer.parseInt(rows[i][j]);
                }
            }
        }

        for (int i = 0; i < M; i++) {
            String[] x_y = br.readLine().split(" ");
            int x1 = Integer.parseInt(x_y[0]) - 2;
            int y1 = Integer.parseInt(x_y[1]) - 2;
            int x2 = Integer.parseInt(x_y[2]) - 1;
            int y2 = Integer.parseInt(x_y[3]) - 1;

            int res = 0;
            if (x1 < 0 && y1 < 0) res = sum[x2][y2];
            else if (x1 < 0) res = sum[x2][y2] - sum[x2][y1];
            else if (y1 < 0) res = sum[x2][y2] - sum[x1][y2];
            else res = sum[x2][y2] - sum[x1][y2] - sum[x2][y1] + sum[x1][y1];
            bw.write(res + "\n");
        }

        bw.flush();
        bw.close();
    }
}