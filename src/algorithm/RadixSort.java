package algorithm;

import java.io.*;

public class RadixSort {
    public static int[] a;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        a = new int[n];

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        radixSort(a, 5);

        for (int a : a) {
            bw.write(a + " ");
        }
        bw.flush();
        bw.close();

    }

    public static void radixSort (int[] a, int maxDigit) {
        int len = a.length;
        int[] output = new int[len];
        int digit = 1;
        int cnt = 0;

        while (cnt != maxDigit) {
            int[] bucket = new int[10];
            for (int i = 0; i < len; i++) {
                bucket[(a[i] / digit) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = len - 1; i >= 0; i--) {
                output[bucket[(a[i]) / digit % 10] - 1] = a[i];
                bucket[(a[i] / digit) % 10]--;
            }
            for (int i = 0; i < len; i++) {
                a[i] = output[i];
            }
            digit *= 10;
            cnt++;
        }
    }
}
