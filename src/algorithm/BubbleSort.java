package algorithm;

import java.io.*;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        bubbleSort(a);

        for (int e : a) {
            bw.write(e + " ");
        }
        bw.flush();
        bw.close();
    }

    public static void bubbleSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int cnt = 0;
            for (int j = 1; j < len - i; j++) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j-1);
                    cnt++;
                }
            }
            if (cnt == 0) break;
        } 
    }

    public static void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
}
