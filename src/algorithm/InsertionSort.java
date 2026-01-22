package algorithm;

import java.io.*;

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        insertionSort(a);

        for (int e : a) {
            bw.write(e + " ");
        }        
        bw.flush();
        bw.close();
    }

    public static void insertionSort(int[] a) {
        int len = a.length;

        for (int i = 1; i < len; i++) {
            int tmp = a[i];
            int pos = i;
            for (int j = i - 1; j >= 0; j--) {
                if (tmp <= a[j]) {
                    a[j + 1] = a[j];
                    pos = j;
                }
                else break;
            }
            a[pos] = tmp;
        } 
    }
}
