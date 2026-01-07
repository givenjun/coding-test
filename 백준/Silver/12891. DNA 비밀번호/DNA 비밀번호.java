import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] SP = br.readLine().split(" ");
        int S = Integer.parseInt(SP[0]);
        int P = Integer.parseInt(SP[1]);

        String str = br.readLine();
        char[] c = new char[S];
        for (int i = 0; i < S; i++) {
            c[i] = str.charAt(i);
        }

        String[] ACGT = br.readLine().split(" ");
        int[] acgt = new int[4];
        int[] arr = new int[4];

        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            acgt[i] = Integer.parseInt(ACGT[i]);
        }
        
        for (int i = 0; i < P; i++) {
            if (c[i] == 'A') {
                arr[0]++;
            }
            else if (c[i] == 'C') {
                arr[1]++;
            }
            else if (c[i] == 'G') {
                arr[2]++;
            }
            else if (c[i] == 'T') {
                arr[3]++;
            }
        }
        if (arr[0] >= acgt[0] && arr[1] >= acgt[1] &&
                arr[2] >= acgt[2] && arr[3] >= acgt[3]) {
                cnt++;
        }

        for (int i = P; i < S; i++) {
            if (c[i - P] == 'A') {
                arr[0]--;
            }
            else if (c[i - P] == 'C') {
                arr[1]--;
            }
            else if (c[i - P] == 'G') {
                arr[2]--;
            }
            else if (c[i - P] == 'T') {
                arr[3]--;
            } 

            if (c[i] == 'A') {
                arr[0]++;
            }
            else if (c[i] == 'C') {
                arr[1]++;
            }
            else if (c[i] == 'G') {
                arr[2]++;
            }
            else if (c[i] == 'T') {
                arr[3]++;
            }

            if (arr[0] >= acgt[0] && arr[1] >= acgt[1] &&
                arr[2] >= acgt[2] && arr[3] >= acgt[3]) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
