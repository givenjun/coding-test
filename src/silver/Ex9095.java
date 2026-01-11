package silver;

import java.io.*;

public class Ex9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(cnt(N) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int cnt(int N) {

        int x = 1, y = 2, z = 3;
        int cnt = 0;
        int res = 0;
        String s = "";

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N / y; j++) {
                for (int k = 0; k <= N / z; k++) {
                    res = x * i + y * j + z * k;
                    s = i +"  "+ j + "  " + k;
                    if (res == N) {
                        System.out.println(s);
                        if ((i == 0 && j == 0) || (j == 0 && k == 0) || (k == 0 && i == 0)) {
                            cnt++;
                        }
                        else if (i == 0) {cnt += j + k;} 
                        else if (j == 0) {cnt += i + k;}
                        else if (k == 0) {cnt += i + j;}
                        else cnt += i * j * k;
                    }
                }
            }
        }

        return cnt;
    }
}
