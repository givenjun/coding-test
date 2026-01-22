package platinum;

import java.io.*;

public class Ex1517 {
    public static int[] a;
    public static int[] tmp;
    public static long res = 0;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        a = new int[n];
        tmp = new int[n];

        String[] s = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        mergeSort(0, n - 1);

        bw.write(res + " ");
        bw.flush();
        bw.close();
    }

    public static void mergeSort (int s, int e) {
        if (e - s < 1) return;

        int m = s + (e - s) / 2;

        mergeSort(s, m);
        mergeSort(m + 1, e);

        for (int i = s; i <= e; i++) {
            tmp[i] = a[i];
        }

        int k = s;
        int left = s;
        int right = m + 1;
        while (left <= m && right <= e) {
            if (tmp[left] > tmp[right]) {
                a[k] = tmp[right];
                res = res + right - k;
                k++;
                right++;
            }
            else {
                a[k] = tmp[left];
                k++;
                left++;
            }
        }
        while (left <= m) {
            a[k] = tmp[left];
            k++;
            left++;
        }
        while (right <= e) {
            a[k] = tmp[right];
            k++;
            right++;
        }
    }
}
