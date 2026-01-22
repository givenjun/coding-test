package algorithm;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] a = new int[n];
        String[] s = sc.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        quickSort(a, 0, n-1);
        System.out.println(a[k - 1]);
        
    }

    public static void swap (int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static int partition(int[] a, int s, int e) {
        int m = (s + e) / 2;
        int pivot = a[m];
        
        while(s <= e) {
            while (a[s] < pivot) s++;
            while (a[e] > pivot) e--;

            if (s <= e) {
                swap(a, s, e);
                s++;
                e--;
            }
        }
        return s;
    }

    public static void quickSort(int[] a, int s, int e) {
        int part2 = partition(a, s, e);

        if (s < part2 - 1) {
            quickSort(a, s, part2 - 1);
        }

        if (part2 < e) {
            quickSort(a, part2, e);
        }

    }
}
