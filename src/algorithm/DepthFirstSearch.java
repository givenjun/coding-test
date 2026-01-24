package algorithm;

import java.io.*;
import java.util.*;

public class DepthFirstSearch {
    public static boolean[] visited;
    public static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        arr = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
        }

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                DFS(i);
                System.out.println();
            }
        }
    }

    public static void DFS(int s) {
        if (visited[s]) return;

        visited[s] = true;
        System.out.print(s + "");
        for (int i : arr[s]) {
            if (!visited[i]) {
                System.out.print(" -> ");
                DFS(i);
            }
        }
    }
}
