package silver;

import java.io.*;
import java.util.*;

public class Ex11724 {
    public static boolean[] chkList;
    public static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int cnt = 0;

        chkList = new boolean[n + 1];
        arr = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);

            arr[u].add(v);
            arr[v].add(u);
        }
        
        for (int i = 1; i < n + 1; i++) {
            if (!chkList[i]) {
                cnt++;
                DFS(i);
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }

    public static void DFS(int s) {
        if (chkList[s]) return;
        
        chkList[s] = true;
        for (int i : arr[s]) {
            if (!chkList[i]) {
                DFS(i);
            }
        }
    }
}
