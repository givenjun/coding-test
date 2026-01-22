package algorithm;

import java.io.*;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }        

        selectionSort(a);

        for (int e : a) {
            bw.write(e + " ");
        }
        bw.flush();
        bw.close();
    }

    public static void selectionSort(int[] a) {
        int len = a.length;

        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE;
            int pos = 0;
            for (int j = i; j < len; j++) {
                if (min >= a[j]) {
                    min = a[j];
                    pos = j;
                }
            }
            swap(a, i, pos);
        }
    }

    public static void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
}
